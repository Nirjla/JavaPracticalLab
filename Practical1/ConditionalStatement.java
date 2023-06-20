public class ConditionalStatement{            
    public static void main(String[] args) {
        // If statement
        int x=10;
        if(x>5)
        {
            System.out.println("x is greater than 5.");

        }
        //If else statement
        int y=3;
        if (y>10){
            System.out.println("y is greater than 10");
        }
        else{
        System.out.println("y is less than or equal to 10.");

        }

        //if--else if statement
       int z=5;
       if (z<4){
        System.out.println("z is less than 4");
       }
       else if(z>10){
        System.out.println("z is greater than 10");
       }
       else{
        System.out.println("z is between 4 and 10.");
       }
        
       //while loop
       int i=0;
       while(i<5)
       {
        System.out.println("i is "+ i);
        i++;
       }

       //Do....while loop
       int j=0;
       do{
        System.out.println("j is "+j);
        j++;
       }while(j<10);
    

    //For loop
    for(int k=0;k<5;k++)
    {
        System.out.println("k is "+ k);
    }
    

    //For each loop
    int[] numbers={1,2,3,4,5};
    for(int num : numbers){
        System.out.println("num is "+num);
    }
}
}