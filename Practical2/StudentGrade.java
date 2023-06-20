
 import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int total=0;
    double percentage;
        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter the marks of "+i+ " subject:");
            int marks = sc.nextInt();
            total += marks;
            
        }
        percentage = (double)total/5; 
        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 60) {
            grade = 'B';
        } else if (percentage >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Print grade obtained
        System.out.println("Grade obtained: " + grade);

        sc.close();  
}
}

