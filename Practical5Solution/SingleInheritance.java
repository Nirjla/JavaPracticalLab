
class Vehicles {
    public int reg_id;
    public String name;
    public String brand;
    public String color;

    public void setVehicles(int reg_id, String name, String brand, String color) {
        this.reg_id = reg_id; // instance variable
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public void displayVehicles() {
        System.out.println("Registration ID: " + this.reg_id);
        System.out.println("Name: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
    }
}

class Bike extends Vehicles {
    public int gear;
    public String speed;

    public void setBike(int gear, String speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void displayBike() {
        System.out.println("Gear: " + this.gear);
        System.out.println("Speed: " + this.speed);
    }
}


class Scooter extends Vehicles {
    public String transmission;

    public void setScooter(String transmission) {
        this.transmission = transmission;
    }

    public void displayScooter() {
        System.out.println("Transmission Mode: " + this.transmission);
    }

}

public class SingleInheritance{
    public static void main(String[] args) {
        // For bike
        Bike b1 = new Bike();
        b1.setVehicles(322, "Pulsar", "Bajaj", "Black");
        b1.displayVehicles();
        b1.setBike(5, "140");
        b1.displayBike();

        // For scooter
        Scooter s1 = new Scooter();
        s1.setVehicles(2222, "DIO", "Honda", "Red");
        s1.displayVehicles();
        s1.setScooter("Electric");
        s1.displayScooter();
    }
}
