// Parent interface: Shape
interface Shape {
    void draw();
}

// Child interface: ColoredShape extending Shape
interface ColoredShape extends Shape {
    void setColor(String color);
}

// Class implementing ColoredShape
class Circle implements ColoredShape {
    private String color;
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Setting circle color to " + color);
    }
}

// Main class: InterfaceInheritanceDemo
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.setColor("Red");
    }
}