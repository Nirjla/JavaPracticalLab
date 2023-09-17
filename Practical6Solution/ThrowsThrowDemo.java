// Custom Exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Class with a method that throws an exception
class Example {
    public void divide(int dividend, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Divisor cannot be zero");
        }

        int quotient = dividend / divisor;
        System.out.println("Quotient: " + quotient);
    }
}

// Main class: ExceptionDemo
public class ThrowsThrowDemo {
    public static void main(String[] args) {
        Example example = new Example();

        try {
            example.divide(10, 2);
            example.divide(10, 0);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}