import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to checked whether it is odd or even.");
        int num = sc.nextInt();
        sc.close();

        if(num%2==0)
        {
            System.out.println(num + " is even number.");
        }
        else
        {
            System.out.println(num + " is odd number.");
        }

    }
}
