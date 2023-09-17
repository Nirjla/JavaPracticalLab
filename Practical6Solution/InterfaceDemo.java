// Interface: Number
interface Number {
    int square(int x);
    int cube(int x);
}

// Class: NumberDemo implementing Number interface
class NumberDemo implements Number {
    @Override
    public int square(int x) {
        return x * x;
    }
    
    @Override
    public int cube(int x) {
        return x * x * x;
    }
}


public class InterfaceDemo{
    public static void main(String[] args) {
        // Creating an instance of NumberDemo class
        NumberDemo numberDemo = new NumberDemo();
        
        // Calling methods from the Number interface
        int squareResult = numberDemo.square(4);
        int cubeResult = numberDemo.cube(3);
        System.out.println("Square: " + squareResult);
        System.out.println("Cube: " + cubeResult);
    }
}