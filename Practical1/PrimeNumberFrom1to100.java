// import java.util.Scanner;
public class PrimeNumberFrom1to100 {
    public static void main(String[] args) {
        System.out.println("The prime number occur between 1 to 100:");
        
        int i,j;
        for(i=2;i<=100;i++)
        {  
            int count=0;
            for(j=1;j<=i;j++)
            {
            if(i%j==0)
            {
                count++;
                
            }
        }
        
        if(count==2){
           System.out.println(i);
        }
    }
        
        
    
    }
}
