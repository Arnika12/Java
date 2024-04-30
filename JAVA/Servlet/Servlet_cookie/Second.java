import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Second extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            // Retrieve cookies from the request
            Cookie ck[] = request.getCookies();
            
            // Print a greeting message using the value of the first cookie
            out.print("Hello " + ck[0].getValue());
            
            // Close the PrintWriter
            out.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

