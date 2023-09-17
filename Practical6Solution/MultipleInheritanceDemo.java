interface Calcs1{
    // list of abstract method only
    void add(int x,int y);
    void subtract (int x, int y);
}
interface Calcs2{
    void multiply (int x, int y);
    void divide(int x , int y);
}
class Sols implements Calcs1, Calcs2 {

    @Override
    public void add(  int x, int y) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Sum is: "+(x+y));
    }

    @Override
    public void subtract(int x, int y) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Subtract is: "+(x-y));
    }

    @Override
    public void multiply(int x, int y) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Multplication is: "+(x*y));    
    }

    @Override
    public void divide(int x, int y) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    System.out.println("Division is: "+(x/y));
    }
    
    
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
//        we cannot create the object of interface


        Sols s1 = new Sols(); 
        s1.add(2, 3);
    s1.subtract(45, 2);
        s1.multiply(2, 45);
        s1.divide(55, 5);
//         // creating reference of interface
//         Calcs1 c1;
// //         assigning object of class into ref of interface
//         c1 = s1;
// //        now c1 can call the method of itself
//         c1.add(23,45);
//         c1.subtract(23,2);
        
    }
}
