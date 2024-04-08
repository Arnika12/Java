/*6. Write a program to create a shopping mall. User must be allowed to do purchase from two pages. Each page should have a page total. 
      The third page should display a bill, 
      which consists of a page total of whatever the purchase has been done and print the total. (Use HttpSession)*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShoppingServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String item = request.getParameter("item");
        double price = Double.parseDouble(request.getParameter("price"));
        
        if (session.getAttribute("total") == null) {
            session.setAttribute("total", price);
        } else {
            double currentTotal = (double) session.getAttribute("total");
            session.setAttribute("total", currentTotal + price);
        }
        
        response.sendRedirect("shopping_page_2.html");
    }
}
