// Abstract class: Calculator
abstract class Calculator {
    protected int x;
    protected int y;
    
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void findSum() {
        int sum = x + y;
        System.out.println("Sum: " + sum);
    }
    
    public abstract void findDiff();
    
    public abstract int findMulti();
}

// Subclass: Solution
class Solution extends Calculator {
    private int a;
    private int b;
    
    public Solution(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void findDiff() {
        int diff = a - b;
        System.out.println("Difference: " + diff);
    }
    
    @Override
    public int findMulti() {
        return a * b;
    }
    
    public void calcDiv() {
        if (b != 0) {
            double div = (double) a / b;
            System.out.println("Division: " + div);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

// Main class: AbstractDemo
public class AbstractDemo {
    public static void main(String[] args) {
        // Creating an instance of the Solution class
        Solution solution = new Solution(10, 5, 8, 2);
        
        // Calling methods from the abstract class
        solution.findSum();
        solution.findDiff();
        
        // Calling the findMulti() method and printing the result
        int multiplication = solution.findMulti();
        System.out.println("Multiplication: " + multiplication);
        
        // Calling the calcDiv() method
        solution.calcDiv();
    }
}