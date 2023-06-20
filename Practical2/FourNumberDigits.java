import java.util.Scanner;
public class FourNumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum= 0;
        int rev=0;
        int sumOfSquare=0;
        while(true){
                System.out.println("Enter four digits number: ");
                int num = sc.nextInt();
         if(num>=1000 && num<=9999){
            System.out.println("Displaying the each number separately:");
            
            while(num!=0){
               int rem = num % 10;
               num = num/10;
               System.out.println(rem);
               sum += rem;
               rev= rev * 10 +rem;
               sumOfSquare += rem*rem;
            }
            System.out.println("Sum of 4-digits: "+ sum);
            System.out.println("Reverse of 4-digits: "+ rev);
            System.out.println("Sum of square of each digit: "+ sumOfSquare);
            sc.close();
            break;
        }     
    }
    
}

        





    }
