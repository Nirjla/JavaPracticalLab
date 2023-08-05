//8.Create an abstract class Calculation which has one normal method int add(int x, int y) which will calculate the sum of x and y and return the results and one abstract method int mul (int x, int y) that performs multiplication. Create a class Demo that inherit abstract class that implement all the abstract method, and it have its own method int calcDiv(int x, int y) that calculates the division between x and y and return the result. Now create the object of Demo and demonstrate the above scenario. After this access the method of abstract class using reference of abstract class.

abstract class Calculation {
    public int add(int x, int y) {
        return x + y;
    }

    public abstract int mul(int x, int y);
}

class Demo extends Calculation {
    public int mul(int x, int y) {
        return x * y;
    }

    public int calcDiv(int x, int y) {
        return x / y;
    }
}

public class CalculationDemo {
    public static void main(String[] args) {
        Demo demoObj = new Demo();
        int a = 10;
        int b = 5;

        // Demonstrate the methods of the Demo class
        System.out.println("Multiplication of " + a + " and " + b + " is: " + demoObj.mul(a, b));
        System.out.println("Division of " + a + " and " + b + " is: " + demoObj.calcDiv(a, b));

        // Access the add method of the Calculation class using a reference of the Calculation type
        Calculation calcObj = new Demo();
        System.out.println("Addition of " + a + " and " + b + " is: " + calcObj.add(a, b));
    }

}
