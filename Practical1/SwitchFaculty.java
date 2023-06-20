import java.util.Scanner;
public class SwitchFaculty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        switch(num){
            case 1:
        System.out.println("Enter BBA\nBIM or\nBCA");
        String course = sc.next();
        switch(course){
            case "BBA":
            System.out.println("Your fee for BBA is 3 lakhs.");
             break;
            case "BIM":
            System.out.println("Your fee for BIM is 4 lakhs.");
             break;
            case "BCA":
            System.out.println("Your fee for BCA is 7 lakhs.");
             break;
            default:
            System.out.println("Invalid course choosen.");
             break;
        }
        break;
        case 2:
        System.out.println("Enter BBM or\n BBS");
        String course1 = sc.next();
        switch(course1){
            case "BBM":
            System.out.println("Your fee for BBM is 2 lakhs");
            break;
            case "BBS":
            System.out.println("Your fee for BBS is 2 lakhs");
            break;
            default:
            System.out.println("Invalid course choosen.");
            break;
        }
        break;
        default:
        System.out.println("Invalid number choosen.");
    }
        sc.close();
    }
}
