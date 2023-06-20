
import java.util.Scanner;
public class PrimeorComposite {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter a number to check whether it is prime or composite:");
       int num = sc.nextInt();
       sc.close();
       int count=0;
       for(int i=1;i<=num;i++)
       {
        if(num%i==0){
            count++;
           
        }
    }
        if(count==2)
        {
            System.out.println(num + " is prime number.");
        }
        else
        {
            System.out.println(num + " is composite number.");
        }
       
        
    }
    
}
