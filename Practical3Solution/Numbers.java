class Number{
    int x; 
    int y;

    // default constructor
    public Number(){
        x = 0;
        y = 0;
    }

    // parameterized constructor
    public Number(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void findOdd(){
        System.out.println("Odd numbers between "+ this.x+" and "+ this.y+ " are:");
        for(int i = this.x; i<= this.y;i++){
             if(i % 2 != 0){
                System.out.println(i + " ");
             }
        }
    }

      public void findEven() {
        System.out.print("Even numbers between " + this.x + " and " + this.y + " are: ");
        for (int i = this.x; i <= this.y; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
}

}

public class Numbers {
    public static void main(String[] args) {
        
    //  create objects of class Number

    Number num1 = new Number();
    Number num2 = new Number(10,19);

    
    num1.findOdd();
    num1.findEven();

    num2.findOdd();
    num2.findEven();

    }
    
}
