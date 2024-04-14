//1. Write a servlet program to display current date and time of server.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class DateTimeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Date currentDate = new Date();
        
        out.println("<html>");
        out.println("<head><title>Current Date and Time</title></head>");
        out.println("<body>");
        out.println("<h1>Current Date and Time:</h1>");
        out.println("<p>" + currentDate.toString() + "</p>");
        out.println("</body></html>");
    }
}
