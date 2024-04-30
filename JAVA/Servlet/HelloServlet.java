<<<<<<< HEAD
// Write a Servlet application to display Hello Java Message on the Browser.  

=======
>>>>>>> 371961e9693af45948ef6335ee9289baba1ff48d
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

<<<<<<< HEAD
@WebServlet("/hello")
=======
>>>>>>> 371961e9693af45948ef6335ee9289baba1ff48d
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello Java Message</h2>");
        out.println("</body></html>");
    }
}
<<<<<<< HEAD

=======
>>>>>>> 371961e9693af45948ef6335ee9289baba1ff48d
