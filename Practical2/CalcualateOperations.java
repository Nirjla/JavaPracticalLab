import java.util.Scanner;

public class CalcualateOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter your choice of operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Difference between " + num1 + " and " + num2 + " is " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Product of " + num1 + " and " + num2 + " is " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + result);
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}