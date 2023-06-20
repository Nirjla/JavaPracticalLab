import java.util.Scanner;
public class DivisionOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two different numvers:");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double quotient = num1/num2;
        double remainder = num1 % num2;
        System.out.println("Quotient of "+ num1+ " and "+ num2+ " is: "+quotient);
        System.out.println("Division of "+ num1+ " and "+ num2+ " is: "+remainder);
        sc.close();
    }
}