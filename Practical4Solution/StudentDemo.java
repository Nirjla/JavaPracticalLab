class Student{
    int roll;
    String name;
    String address;
    String faculty;
    String grade;
    
    public Student(int roll, String name, String address, String faculty,String grade){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.faculty = faculty;
        this.grade =grade;
    }

    public String findDivision(){
      
        switch(this.grade){
            case "A+":
            return "Distinction";
            
            case "A":
            return "Very Good";
            
             case "B+":
            return "First Division";
        case "B":
            return "Second Division";
        case "C":
            return "Pass in individual subjects";
        case "D":
            return "Fail";
        default:
            return "Invalid Grade";
        }
    }
    public void display() {
    System.out.println("Roll No: " + roll);
    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Faculty: " + faculty);
    System.out.println("Grade: " + grade);
    System.out.println("Division: " + findDivision());
}


}


public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Nirjala Shakya","Chamati","BCA","A+");
        s1.display();
        Student s2 = new Student(2, "Bishow Khadgi","Makhan" , "BSCIT", "A");
        s2.display();
    }
}
