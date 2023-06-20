import java.util.Scanner;
public class InputTaken {
    public static void main(String[] args) {
         //String input taken from user
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name:");
         String name = sc.next();
         System.out.println("Hello "+ name + "!");
        



        //Integer input taken from user
        
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Your age is "+ age + "years old.");


        //close the sc object to prevent resource leak
         sc.close();
    }
    
}
