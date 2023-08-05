class Number1{
    int x;
    int y;
    int z;

    public Number1(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getMax(){
        if(this.x > this.y && this.x > this.z){
            return this.x;
        }
        else if(this.y>this.x && this.y>this.z){
          return this.y;
        }
        else{
            return this.z;
        }
    }
}


public class GreatestNumber {
    public static void main(String[] args) {
        
        // create object of Number1 class
        Number1 num = new Number1(10, 25, 18);

        // find and display the greatest number
        int max = num.getMax();
        System.out.println("The greatet number : "+ max);
    
    }
    
}
