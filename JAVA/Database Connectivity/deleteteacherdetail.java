import java.sql.*;

public class DeleteTeacherDetails {

    public static void main(String[] args) {
        // Teacher details to delete
        int teacherIdToDelete = 1; 
        
        try {

            Class.forName("org.postgresql.Driver");
           Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/test","postgres","");
	
            // Prepare a SQL statement to delete the teacher
            String sql = "DELETE FROM Teacher WHERE tno = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                // Set the parameter (teacher ID) for the prepared statement
                pstmt.setInt(1, teacherIdToDelete);
                
                // Execute the delete statement
                int rowsAffected = pstmt.executeUpdate();
                
                // Check if any rows were affected
                if (rowsAffected > 0) {
                    System.out.println("Teacher details deleted successfully.");
                } else {
                    System.out.println("No teacher found with the given ID.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
