class Rectangle{
    double l;
    double b;

    public void setDimensions(double l, double b){
          this.l = l;
          this.b = b;
    }

    public double computeArea()
    {
        return this.l*this.b;
    }

    public void displayArea(){
        System.out.println("Area of the rectangle: "+ computeArea());
    }
}


public class Shape {
    public static void main(String[] args) {
        
        // create objects of class Rectnagle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

          // set dimensions for r1
          r1.setDimensions(4.5, 6.7);

          // set dimensions for r2
          r2.setDimensions(5.2, 7.9);
  
          // display area for r1
          System.out.println("Rectangle 1:");
          r1.displayArea();
  
          // display area for r2
          System.out.println("\nRectangle 2:");
          r2.displayArea();
      }


    }
    

