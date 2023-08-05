class ExamDept {
    public int roll;
    public String name;
    public String address;
    public String faculty;

    public void setStudentDetails(int roll, String name, String address, String faculty) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.faculty = faculty;
    }

    public void displayStudentDetails() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Faculty: " + faculty);
    }
}

class Result extends ExamDept {
    private int[] marks = new int[5];

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void calcPercentage() {
        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        float percentage = (float) totalMarks / (marks.length * 100) * 100;
        String division = "";
        if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 45) {
            division = "Second Division";
        } else if (percentage >= 35) {
            division = "Third Division";
        } else {
            division = "Fail";
        }
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Division: " + division);
    }
}

public class ExamDeptDemo {
    public static void main(String[] args) {
        Result resultObj = new Result();
        resultObj.setStudentDetails(1234, "John Doe", "123 Main St", "Science");
        int[] marks = {75, 80, 85, 90, 95};
        resultObj.setMarks(marks);
        resultObj.displayStudentDetails();
        resultObj.calcPercentage();
    }
}