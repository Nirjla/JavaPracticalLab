class Box{
    double length;
    double breadth;
    double height;
    // parameterized constructor
    public Box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;

    }


    public double computeVolume(){
  return this.length*this.breadth*this.height;
    }
 



}


public class Boxes {
    public static void main(String[] args) {
        // / create objects of Box class
        Box box1 = new Box(3.2, 4.5, 5.6);
        Box box2 = new Box(6.7, 8.9, 2.1);

       

        // compute and display volume for box1
        double volume1 = box1.computeVolume();
        System.out.println("Volume of Box 1: " + volume1);

        // compute and display volume for box2
        double volume2 = box2.computeVolume();
        System.out.println("Volume of Box 2: " + volume2);
    }
    
}
