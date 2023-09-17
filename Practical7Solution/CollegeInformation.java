import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CollegeInformation {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("prime.txt");

            for (int i = 1; i <= 3; i++) {
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Enter information for College " + i + ":");
                
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Address: ");
                String address = scanner.nextLine();
                
                System.out.print("Number of students enrolled: ");
                int numStudents = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                
                String collegeInfo = "College " + i + ":\n"
                        + "Name: " + name + "\n"
                        + "Address: " + address + "\n"
                        + "Number of students enrolled: " + numStudents + "\n\n";
                
                fileWriter.write(collegeInfo);
            }

            fileWriter.close();
            System.out.println("College information stored successfully in prime.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}