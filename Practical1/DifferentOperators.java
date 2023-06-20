public class DifferentOperators {
    public static void main(String[] args) {
        int a=34;
        int b=45;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Arithmetic Operator:");
        System.out.println("Addition: "+ sum);
        System.out.println("Subtraction:"+ diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.print("\n");
        System.out.println("Increment Operator:");
        a++;
        System.out.println("a= "+ a);
        b--;
        System.out.println("b= "+ b);
        System.out.print("\n");
        System.out.println("Comparison Operator:");
        boolean isEqual = a==b;
        boolean isGreater = a>b;
        boolean isLessOrEqual = a<b;
        boolean isNotEqual = a!=b;
        System.out.println("isEqual = " + isEqual);
        System.out.println("isGreater = " + isGreater);
        System.out.println("isLessOrEqual = " + isLessOrEqual);
        System.out.println("isNotEqual = "+isNotEqual);
        System.out.print("\n");
        System.out.println("Boolean Logical Operators:");
        boolean bool1 = true;
        boolean bool2 = false;
        boolean andResult = bool1 && bool2;
        boolean orResult = bool1 || bool2;
        boolean notResult = !bool1;
        System.out.println("andResult = " + andResult);
        System.out.println("orResult = " + orResult);
        System.out.println("notResult = " + notResult);


        
    }
}
