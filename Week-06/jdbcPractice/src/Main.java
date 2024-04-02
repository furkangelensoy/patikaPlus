import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/jdbcpractice";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String query = "SELECT * FROM employees";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Position: " + resultSet.getString("position"));
                System.out.println("Salary: " + resultSet.getInt("salary"));
                System.out.println("######################################################");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}