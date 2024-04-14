/*3. Design the table User (username, password) using Postgre Database. Design HTML login screen. Accept the user name and password from the 
user. Write a servlet program to accept the login name and password and validates it from the database you have created. 
If it is correct then display Welcome.html otherwise display Error.html.*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        boolean isValidUser = validateUser(username, password);
        
        if (isValidUser) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("Welcome.html");
        } else {
            response.sendRedirect("Error.html");
        }
    }
    
    private boolean validateUser(String username, String password) {
        String url = "jdbc:postgresql://localhost:5432/your_database_name";
        String user = "your_database_username";
        String pass = "your_database_password";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM User WHERE username = ? AND password = ?")) {
            
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rs = stmt.executeQuery();
            
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
