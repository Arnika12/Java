import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String n = request.getParameter("userName");
            out.print("Welcome " + n);
            Cookie ck = new Cookie("uname", n); // Creating cookie object
            response.addCookie(ck); // Adding cookie in the response
            // Creating submit button
            out.print("<form action='http://localhost:8080/serv/Second'>");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

