import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateSalaryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeManager employeeManager;

    public void init() {
        // Initialize the EmployeeManager
        employeeManager = new EmployeeManager();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve parameters from the request
        String employeeId = request.getParameter("employeeId");
        double newSalary = Double.parseDouble(request.getParameter("newSalary"));

        // Update the salary and get the result
        boolean isUpdated = employeeManager.updateEmployeeSalary(employeeId, newSalary);

        // Send response to the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (isUpdated) {
            out.println("<h2>Salary Updated Successfully</h2>");
            out.println("<p>Employee ID: " + employeeId + "</p>");
            out.println("<p>New Salary: " + newSalary + "</p>");
        } else {
            out.println("<h2>Failed to Update Salary</h2>");
            out.println("<p>Employee ID: " + employeeId + " not found</p>");
        }
        out.println("</body></html>");
    }
}
