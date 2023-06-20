import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();

        double tax;
        if (salary <= 100000) {
            tax = 0.01 * salary;
        } else if (salary > 100000 && salary < 500000) {
            tax = 0.05 * salary;
        } else {
            tax = 0.1 * salary;
        }

        double netSalary = salary - tax;
        System.out.println("Tax: " + tax);
        System.out.println("Net salary: " + netSalary);

        sc.close();
    }
}