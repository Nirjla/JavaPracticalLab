class Fourwheeler{
    private int reg;
    private String name;
    private String brand;
    //default constructor
    public Fourwheeler(){
    System.out.println("This is default of fourwheeler");
}
//    parameterized constructor
public Fourwheeler(int reg, String name, String brand){
    this.reg = reg;
    this.name = name;
    this.brand = brand;
}

public void displayFourWheel(){
    System.out.println("reg is "+this.reg);
    System.out.println("name is "+this.name);
    System.out.println("brand is "+this.brand);
}



}
class Hatchback extends Fourwheeler{
    private String seat;
    private String driveMode;
    public Hatchback(){
        super();//calls default of super class
        System.out.println("This is default of hatchback");
    }
    public Hatchback(String seat, String driveMode)
    {
//        call the parameterized constructor of super class
        super(1,"santro","hundyai");
          this.seat = seat;
          this.driveMode = driveMode;
                
    }
    public void displayHatchback()
    {
        System.out.println("Seat capacity is "+ this.seat);
        System.out.println("Drive Mode is "+ this.driveMode);
    }
    
   
}



public class SuperDemo {
    public static void main(String[] args) {
        Hatchback h1 = new Hatchback();
        Hatchback h2 = new Hatchback("5","manual");
        h2.displayFourWheel();
        h2.displayHatchback();
    }
    
}
