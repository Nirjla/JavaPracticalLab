import java.util.Scanner;
public class FiveSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total=0;
        double percentage;
        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter the marks of "+i+ " subject:");
            double marks = sc.nextDouble();
            total += marks;
            
        }
        percentage = total/5;
        System.out.println("The percentage of five subjects is "+ percentage);
        if(percentage >= 80)
        {
            System.out.println("Division is Disctinction");
        }
        else if(percentage>= 60 && percentage<80)
        {
            System.out.println("First Division");
        }
        else if(percentage>=40 && percentage<60)
        {
            System.out.println("Second Division");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
