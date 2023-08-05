class Shape{
     double length;
     double breadth;
     double height;

     public Shape(){
        length =0;
        breadth = 0;
        height = 0;
     }

     public Shape(double length, double breadth){
        this.length =length;
        this.breadth = breadth;
     }

     public Shape(double length, double breadth, double height){
        this.length =length;
        this.breadth =breadth;
        this.height = height;
     }

     public void calcAreaRectangle(){
        double area =  this.length *this.breadth;
        System.out.println("The area of rectangle is "+ area);
     }

     public void calcVolumeBox(){
        double volume = this.length*this.breadth*this.height;
        System.out.println("The volume of box is "+ volume);
     }



}

public class ShapeDemo {
    public static void main(String[] args) {
        
        
        // create object of Shape class for rectangle
        Shape rectangle = new Shape(4.5, 6.7);

        // calculate area of rectangle
       rectangle.calcAreaRectangle();;


        // create object of Shape class for Box
        Shape box = new Shape(3.2, 4.5, 5.6);
        box.calcVolumeBox();
    }
}
