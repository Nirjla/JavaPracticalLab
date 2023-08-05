class Vehicle{
public int reg;
public String name;
public String brand;
public String color;
public void setVehicle(int reg,String name,String brand,String color){
  this.reg = reg;
  this.name = name;
  this.brand =  brand;
  this.color = color;
}
public void displayVehicle()
{
    System.out.println("Reg: "+this.reg);
    System.out.println("Name: "+this.name);
    System.out.println("Brand: "+this.brand);
    System.out.println("Color: "+this.color);
}
}
class Bikes extends Vehicle{
public int gears;
public void setBikes(int gears){
    this.gears =gears;
}   
public void displayBikes(){
  System.out.println("Gear in Bike: "+this.gears);
}
}
class ElectribBike extends Bikes{
    String range;
public void setElectric(String range){
    this.range = range;
}
public void displayElectric(){
    System.out.println("Range of Electric bike: "+this.range);
}
}
public class MultiLevelDemo {
    public static void main(String[] args) {
        //creating object of grandchild Electricbike
        ElectribBike e1 = new ElectribBike();
        //accesing the properties of Vehicles(grandparent)
        e1.setVehicle(1, "niu", "niu", "red");
        e1.displayVehicle();
        e1.setBikes(5);
        e1.displayBikes();
        //accessing own properties
        e1.setElectric("450");
        e1.displayElectric();
        System.out.println("-------------------------------");
        //creating object of derived child Bike
        Bikes b1 = new Bikes();
        b1.setVehicle(122, "Pulsar", "Bajaj", "black");    
        b1.displayVehicle();
        b1.setBikes(6);
        b1.displayBikes();
    }
}
