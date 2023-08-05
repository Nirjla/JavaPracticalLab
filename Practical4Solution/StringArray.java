
public class StringArray {
    public static void main(String[] args) {
        String[] students = new String[10];
        students[0] = "Emma";
        students[1] = "Olivia";
        students[2] = "Ava";
        students[3] = "Sophia";
        students[4] = "Isabella";
        students[5] = "Mia";
        students[6] = "Charlotte";
        students[7] = "Amelia";
        students[8] = "Harper";
        students[9] = "Anna";
        System.out.print("Names of students that end with the letter 'a' are: ");
        for (int i = 0; i < 10; i++) {
            if (students[i].endsWith("a")) {
                System.out.println(students[i]);
            }
        }
    }
}
