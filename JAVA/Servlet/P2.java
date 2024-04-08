/* 2. Design a servlet to display “Welcome IP address of client” to first time visitor. 
     Display Welcome-back IP address of client” if the user is revisiting the page. (Use Cookies)*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();
        boolean isFirstTime = true;
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visited")) {
                    isFirstTime = false;
                    break;
                }
            }
        }
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        if (isFirstTime) {
            out.println("<html><body>");
            out.println("Welcome " + request.getRemoteAddr());
            out.println("</body></html>");
            
            Cookie visitedCookie = new Cookie("visited", "true");
            response.addCookie(visitedCookie);
        } else {
            out.println("<html><body>");
            out.println("Welcome back " + request.getRemoteAddr());
            out.println("</body></html>");
        }
    }
}
