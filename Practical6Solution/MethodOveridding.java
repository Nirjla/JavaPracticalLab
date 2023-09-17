class Calculation1{
    //method
    public void calc1(int x, int y){
        System.out.println("Sum is "+ (x+y));
    }
    
    public void calc2(int x, int y, int z)
    {
        System.out.println("Multiplication is "+ (x*y*z));
  
     }
}


class Calculation2 extends Calculation1{
//    same parameters and method name inherited from super class
    public void calc1(int x, int y){
        super.calc1(x, y);
        System.out.println("difference is "+ (x-y));
    }
    
    public void calc2(int x, int y, int z)
    {
        super.calc2(x,y,z);
        System.out.println("Simplification is "+ (x+y*z));
  
     }
    
}
public class MethodOveridding {
    public static void main(String[] args) {
        // creating object of subclass
        Calculation2 c2 = new Calculation2();
        c2.calc1(30,20); // calls calc1 of Calculation2 class
        c2.calc2(20,40,2); // calls calc2 of Calculation2 class
                
        
    }
}
