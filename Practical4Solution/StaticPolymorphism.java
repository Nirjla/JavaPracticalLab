class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 5;
        int b = 10;
        int c = 15;
        double d = 3.5;
        double e = 2.5;

        // Call the add method with two integers
        int result1 = calc.add(a, b);
        System.out.println("Result 1: " + result1);

        // Call the add method with two doubles
        double result2 = calc.add(d, e);
        System.out.println("Result 2: " + result2);

        // Call the add method with three integers
        int result3 = calc.add(a, b, c);
        System.out.println("Result 3: " + result3);
    }
}
