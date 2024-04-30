// Write a Servlet program for the implementation of session tracking

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/SessionTrackingServlet")
public class SessionTrackingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the session object
        HttpSession session = request.getSession();

        // Set session attributes
        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }
        session.setAttribute("visitCount", visitCount);

        // Set response content type
        response.setContentType("text/html");

        // Write response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Session Tracking Example</h2>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Number of visits: " + visitCount + "</p>");
        out.println("</body></html>");
    }
}
