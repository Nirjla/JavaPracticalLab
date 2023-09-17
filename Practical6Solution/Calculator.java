// Interface: Num
interface Num {
    int add(int x, int y);
    int diff(int x, int y);
}

// Class: Solve implementing Num interface
class Solve implements Num {
    @Override
    public int add(int x, int y) {
        return x + y;
    }
    
    @Override
    public int diff(int x, int y) {
        return x - y;
    }
}

// Main class: InterfaceDemo
public class Calculator {
    public static void main(String[] args) {
        // Creating an instance of Solve class
        Solve solve = new Solve();
        
        // Calling methods from the Num interface
        int sum = solve.add(5, 3);
        int difference = solve.diff(5, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
