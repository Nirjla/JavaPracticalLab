public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        int x = 10;
        double y = x;
        System.out.println("Implicit type casting (widening):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Explicit type casting (narrowing)
        double a = 3.14;
        int b = (int) a;
        System.out.println("Explicit type casting (narrowing):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
