import java.util.Scanner;
public class FiveSubjectsMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_marks=0;
        float percentage;
        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter the marks of " + i + " subject: ");
            int marks =  sc.nextInt();
            total_marks += marks;
        }
        System.out.println("The total marks of 5 subject is "+ total_marks);
        percentage = total_marks / 5 ;
        System.out.println("The percentage of 5 subjects is "+ percentage); 
        if (percentage>=35)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }
        sc.close();
    }
}
