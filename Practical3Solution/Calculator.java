class Calculate {
    int num1;
    int num2;

    public void setCalc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calcSum() {
        int result1 = this.num1 + this.num2;
        System.out.println("Sum: " + result1);
    }

    public int calcMulti() {
        int result2 = this.num1 * this.num2;
        return result2;

    }

    public void calcDifference() {
        int result3 = this.num1 - this.num2;
        System.out.println("Difference: " + result3);
    }

}

public class Calculator {
    public static void main(String[] args) {

        // create objects of class Calculate
        Calculate c1 = new Calculate();
        Calculate c2 = new Calculate();

        // set data for c1 and c2
        c1.setCalc(5, 3);
        c2.setCalc(45, 30);

        // display calculation
        System.out.println("Calculation 1:");
        c1.calcSum();
        c1.calcDifference();
        int multi1 = c1.calcMulti();
        System.out.println("Multiplication: " + multi1);

        System.out.println("Calculation 2:");
        c2.calcSum();
        c2.calcDifference();
        int multi2 = c2.calcMulti();
        System.out.println("Multiplication: " + multi2);

    }

}
