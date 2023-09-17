import java.sql.*;

public class RegistrationDatabase {
    public static void main(String[] args) {
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db_prime", "root", "");

            // Insert 10 records into the table
            insertData(connection);

            // Display all the data in the table
            displayData(connection);

            // Update the course and country for a person with id 1
            updateData(connection, 1, "BCA", "Japan");

            // Delete records for people with gender male
            deleteData(connection, "male");

            // Display the updated data after deletion
            displayData(connection);

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "INSERT INTO tbl_registration (id, username, password, repassword, gender, course, country) VALUES " +
                "(1, 'John', 'pass123', 'pass123', 'male', 'B.Tech', 'USA'), " +
                "(2, 'Emma', 'pass123', 'pass123', 'female', 'B.Sc', 'UK'), " +
                "(3, 'Michael', 'pass123', 'pass123', 'male', 'MBA', 'Canada'), " +
                // Insert remaining records here...
                "(10, 'Mia', 'pass123', 'pass123', 'female', 'B.A', 'Brazil')";
        statement.executeUpdate(query);
        statement.close();
        System.out.println("Data inserted successfully.");
    }

    private static void displayData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM tbl_registration";
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println("ID\tUsername\tPassword\tRepassword\tGender\tCourse\tCountry");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String repassword = resultSet.getString("repassword");
            String gender = resultSet.getString("gender");
            String course = resultSet.getString("course");
            String country = resultSet.getString("country");
            System.out.println(id + "\t" + username + "\t" + password + "\t" + repassword + "\t" +
                    gender + "\t" + course + "\t" + country);
        }
        resultSet.close();
        statement.close();
    }

    private static void updateData(Connection connection, int id, String course, String country) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "UPDATE tbl_registration SET course = '" + course + "', country = '" + country + "' WHERE id = " + id;
        int rowsAffected = statement.executeUpdate(query);
        statement.close();
        System.out.println("Updated " + rowsAffected + " record(s) successfully.");
    }

    private static void deleteData(Connection connection, String gender) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "DELETE FROM tbl_registration WHERE gender = '" + gender + "'";
        int rowsAffected = statement.executeUpdate(query);
        statement.close();
        System.out.println("Deleted " + rowsAffected + " record(s) successfully.");
    }
}