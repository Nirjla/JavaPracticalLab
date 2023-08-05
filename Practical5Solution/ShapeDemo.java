class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    public void display() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle extends Shape {
    public void display() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    public void display() {
        System.out.println("This is a square of rectangle.");
        super.display(); // Call the display method of the Rectangle class
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Square squareObj = new Square();
        squareObj.display(); // Call the display method of the Square class
    }
}