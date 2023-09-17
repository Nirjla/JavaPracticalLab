import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndCountCharacters {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("tu.txt");
            StringBuilder content = new StringBuilder();
            int character;

            while ((character = fileReader.read()) != -1) {
                content.append((char) character);
            }

            fileReader.close();

            String fileContent = content.toString();
            System.out.println("File content:\n" + fileContent);

            int numCharacters = fileContent.length();
            System.out.println("Number of characters: " + numCharacters);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}