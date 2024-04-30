import java.sql.*;

public class DatabaseManipulation {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            if (connection != null) {
                System.out.println("Connected to the database.");

                // Create at least 5 tables in the database
                createTables(connection);

                // Add a column to a given table
                addColumn(connection, "table_name", "new_column", "INT");

                // Drop a given table from the database
                dropTable(connection, "table_name");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    // Method to create at least 5 tables in the database
    private static void createTables(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            // Create 5 tables (You can adjust the table names and schemas as needed)
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS table1 (id INT PRIMARY KEY, name VARCHAR(50))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS table2 (id INT PRIMARY KEY, address VARCHAR(100))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS table3 (id INT PRIMARY KEY, age INT)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS table4 (id INT PRIMARY KEY, email VARCHAR(100))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS table5 (id INT PRIMARY KEY, phone VARCHAR(20))");
            System.out.println("Tables created successfully.");
        }
    }

    // Method to add a column to a given table
    private static void addColumn(Connection connection, String tableName, String columnName, String columnType) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("ALTER TABLE " + tableName + " ADD COLUMN " + columnName + " " + columnType);
            System.out.println("Column " + columnName + " added to table " + tableName + " successfully.");
        }
    }

    // Method to drop a given table from the database
    private static void dropTable(Connection connection, String tableName) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("DROP TABLE IF EXISTS " + tableName);
            System.out.println("Table " + tableName + " dropped successfully.");
        }
    }
}
