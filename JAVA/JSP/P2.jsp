<!-- 2. Create a JSP page which will accept the file extension and display all files in the 
    current directory having that extension. Each filename should appear as a hyperlink on screen. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>File Listing</title>
</head>
<body>
    <h1>File Listing</h1>
    <form method="post">
        Enter file extension: <input type="text" name="extension">
        <input type="submit" value="Submit">
    </form>

    <%-- Java code to list files --%>
    <%
        // Get the file extension from the form
        String extension = request.getParameter("extension");
        
        if (extension != null && !extension.isEmpty()) {
            // Get the current directory
            String currentDirectory = application.getRealPath("/");
            File directory = new File(currentDirectory);

            // Get all files in the directory
            File[] files = directory.listFiles();

            // Output files with the given extension as hyperlinks
            out.println("<h2>Files with extension ." + extension + ":</h2>");
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith("." + extension)) {
                    // Output filename as hyperlink
                    out.println("<a href=\"" + file.getName() + "\">" + file.getName() + "</a><br>");
                }
            }
        } else {
            out.println("<p>Please enter a file extension.</p>");
        }
    %>
</body>
</html>



 
