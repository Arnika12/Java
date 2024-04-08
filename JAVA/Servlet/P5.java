/*5. Write a servlet which counts how many times a user has visited a web page. If the user is visiting the page for the first time,
      display a welcome message. If the user is re-visiting the page, display the number of times visited. (Use cookies).*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitCounterServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        int visitCount = 0;
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(cookie.getValue());
                    break;
                }
            }
        }
        
        visitCount++;
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        visitCookie.setMaxAge(24 * 60 * 60); // 1 day
        response.addCookie(visitCookie);
        
        out.println("<html><body>");
        if (visitCount == 1) {
            out.println("<h1>Welcome! This is your first visit.</h1>");
        } else {
            out.println("<h1>Welcome back! You have visited " + visitCount + " times.</h1>");
        }
        out.println("</body></html>");
    }
}
