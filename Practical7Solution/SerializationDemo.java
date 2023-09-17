import java.io.*;
class Student implements Serializable{
    private String name;
    private String gender;
    private String faculty;
    private String grade;
    public void setStd(String name,String gender,String faculty,String grade){
//        serilaztion class implements Seriable interface
        this.name = name;
        this.gender = gender;
        this.faculty = faculty;
        this.grade = grade;
    }
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Faculty: "+this.faculty);
        System.out.println("Grade: "+this.grade);
        
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
//        creating new and writing object (serialization)
       try{
       File f1 = new File("obj.txt");
       if(!f1.exists()){
           f1.createNewFile();
           System.out.println("File created");
       }
       else{
           System.out.println("File already exists");
    }
       
       FileOutputStream fos = new FileOutputStream("obj.txt");
//       creating object
       Student s1 = new Student();
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(s1);
           System.out.println("Object written succesfully");
           fos.close();
           oos.close();
//           reading object from file
          FileInputStream fis = new FileInputStream("obj.txt");
          ObjectInputStream ois = new ObjectInputStream(fis);
         Student s2 =  (Student) ois.readObject();
         s2.setStd("ram","male","bca","A");
         s2.display();
         fis.close();
         ois.close();
       }
       catch(IOException i){
               System.out.println(i);
               }
       catch(ClassNotFoundException c){
           System.out.println(c);
       }
    
}
    }

