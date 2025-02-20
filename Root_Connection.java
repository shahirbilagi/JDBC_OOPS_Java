//import all the necessary packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Root_Connection {
    public Root_Connection() {
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TestDB"; //Check which port can be used and modify accordingly 
        String username = "root";
        String password = "password"; //Provide your Root user Password
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            String sql = "SELECT * FROM Users"; //add your specific query to execute
            resultSet = statement.executeQuery(sql);

            while(resultSet.next()) { //Based on table values add your result set
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String email = resultSet.getString("Email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (ClassNotFoundException e) { //Exception Handlings 
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }

        }

    }
}
