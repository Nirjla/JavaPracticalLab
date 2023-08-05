class Student{
     int roll;
     String name;
     String address;
     String gender;
     String faculty;

     public void setData(int roll,String name,String address, String gender,String faculty){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.faculty = faculty;
     }

     public void display(){
        System.out.println("Roll: "+ this.roll);
        System.out.println("Name: "+ this.name);
        System.out.println("Address: "+ this.address);
        System.out.println("Gender: "+ this.gender);   
        System.out.println("Faculty: "+ this.faculty);
    
    
    }



}
public class Students {
    public static void main(String[] args) {
          
        // creating objects of class Student
        Student s1 = new Student();
        Student s2 = new Student();

        // set data for s1 and s2
        s1.setData(1, "Nirjala", "Chamati", "Female", "BCA");
        s2.setData(2, "Bishow", "Makhan", "Male", "Digital Marketing");

        // display data for s1 and s2;
         System.out.println("Student 1:");
         s1.display();

         System.out.println("Student 2");
         s2.display();
    }
    
}
