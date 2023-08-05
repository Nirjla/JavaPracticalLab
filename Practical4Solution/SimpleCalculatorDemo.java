abstract class Calculator {
    public abstract void calcPrime(int x, int y);
    public abstract void calcEven(int x, int y);
}

class SimpleCalculator extends Calculator {
    public void calcPrime(int x, int y) {
        System.out.println("Prime numbers between " + x + " and " + y + ":");
        for(int i=x;i<=y;i++)
     {
        int  count=0;
        
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count++;
            }
         

        }
        if(count==2)
        {
            System.out.println(i);
        }
       
     }
    } 
    

     public void calcEven(int x, int y) {
        System.out.println("Even numbers between " + x + " and " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class SimpleCalculatorDemo {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        int x = 1;
        int y = 20;

        calc.calcPrime(x, y);
        System.out.println();
        calc.calcEven(x, y);
    }
    }
    

