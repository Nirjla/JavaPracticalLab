// Custom Exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class: MultipleCatchDemo
public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int divisor = 0;
            int result = numbers[1] / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}