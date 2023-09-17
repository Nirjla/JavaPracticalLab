import java.sql.*;
import java.util.Scanner;

public class RegistrationDatabase1 {
    public static void main(String[] args) {
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db_prime", "your_username", "your_password");

            // Insert 20 records into the table by taking input from the user
            insertData(connection);

            // Display the record of a person with a given ID
            int idToDisplay = getUserInputInt("Enter the ID of the person to display: ");
            displayData(connection, idToDisplay);

            // Delete the record of a person with a given name
            String nameToDelete = getUserInput("Enter the name of the person to delete: ");
            deleteData(connection, nameToDelete);

            // Display the updated data after deletion
            displayData(connection);

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertData(Connection connection) throws SQLException {
        String query = "INSERT INTO tbl_registration (id, username, password, repassword, gender, course, country) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Enter details for person " + i);
            int id = getUserInputInt("ID: ");
            String username = getUserInput("Username: ");
            String password = getUserInput("Password: ");
            String repassword = getUserInput("Re-enter Password: ");
            String gender = getUserInput("Gender: ");
            String course = getUserInput("Course: ");
            String country = getUserInput("Country: ");

            statement.setInt(1, id);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.setString(4, repassword);
            statement.setString(5, gender);
            statement.setString(6, course);
            statement.setString(7, country);

            statement.executeUpdate();
        }

        statement.close();
        System.out.println("Data inserted successfully.");
    }

    private static void displayData(Connection connection, int id) throws SQLException {
        String query = "SELECT * FROM tbl_registration WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        System.out.println("ID\tUsername\tPassword\tRepassword\tGender\tCourse\tCountry");
        while (resultSet.next()) {
            int personId = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String repassword = resultSet.getString("repassword");
            String gender = resultSet.getString("gender");
            String course = resultSet.getString("course");
            String country = resultSet.getString("country");
            System.out.println(personId + "\t" + username + "\t" + password + "\t" + repassword + "\t" +
                    gender + "\t" + course + "\t" + country);
        }
        resultSet.close();
        statement.close();
    }

    private static void deleteData(Connection connection, String name) throws SQLException {
        String query = "DELETE FROM tbl_registration WHERE username = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, name);

        int rowsAffected = statement.executeUpdate();
        statement.close();
        System.out.println("Deleted " + rowsAffected + " record(s) successfully.");
    }

    private static int getUserInputInt(String message) {
        int result = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                Scanner scanner = new Scanner(System.in);
                result = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return result;
    }

    private static String getUserInput(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}