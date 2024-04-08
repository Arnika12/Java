/*4. Design a servlet that provides information about a HTTP request from a client, such as IP address and browser type. The servlet also 
    provides information about the server on which the servlet is running, 
    such as the operating system type, and the names of currently loaded servlets.*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String ipAddress = request.getRemoteAddr();
        String browser = request.getHeader("User-Agent");
        String serverInfo = getServletContext().getServerInfo();
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h1>HTTP Request Information</h1>");
        out.println("<p>IP Address: " + ipAddress + "</p>");
        out.println("<p>Browser: " + browser + "</p>");
        out.println("<p>Server Info: " + serverInfo + "</p>");
        out.println("</body></html>");
    }
}
