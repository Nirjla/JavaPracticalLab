class Work{
    public void calculate(int a, int b){
        int sum = a+b;
        System.out.println("Sum: "+ sum);
    }

    public double calculate(double a, double b, double c){
        double result = a*b*c;
        return result;
    }
    public void calculate(float a, float b){
        float diff = a - b;
        System.out.println("Difference: "+ diff);
    }

    
}

public class WorkDemo{
    public static void main(String[] args) {
        Work w = new Work();
        // invoke calculate(int, int) method
        w.calculate(10,20);
        // invoke calculate(double, double, double) method
        double multi = w.calculate(2.5, 3.0, 4.0);
        System.out.println("Multiplication : " + multi);
         // invoke calculate(float, float) method
        w.calculate(5.5f, 2.5f);



    }
}