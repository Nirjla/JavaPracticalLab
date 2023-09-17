import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number:");
        int x1 = sc.nextInt();
        System.out.println("Enter second number:");
        int x2 = sc.nextInt();
        try{
            int result = x1/x2;
            System.out.println("Division is "+ result);
            //ArrayIndexOutofBounds: if size of array is exceed
            int []arr1 = new int[5];
                    arr1[0]=10;
                    arr1[1]=10;
                    arr1[2]=10;
                    arr1[3]=10;
                    arr1[4]=10;
                    arr1[5]=10;
                    arr1[6]=10;
                    
            
            
    } catch(ArithmeticException a)
    {
        System.out.println(a);
}
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Code after exception");
        System.out.println("After ");
    }
}