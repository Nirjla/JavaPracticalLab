import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // For positive or negative number
        System.out.println("Enter a number to checked whether positive or negative:");
        int num = sc.nextInt();
        String result = (num >= 0 ? "positive" : "negative");
        System.out.println(num + " is " + result);
        // For even or odd number
        System.out.println("Enter a number to checked whether even or odd:");
        int num2 = sc.nextInt();
        String result2 = (num2 % 2 == 0 ? "even" : "odd");
        System.out.println(num2 + " is " + result2);
        // For greatest among three numbers

        System.out.println("Enter three different numbers to check the greatest one:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int greatest = (n1>n2 && n1>n3 ? n1:((n2>n3)?n2:n3));
        System.out.println("The result is: " + greatest);

        sc.close();

        
    }
}
