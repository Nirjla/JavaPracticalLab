public class BreakAndContinue {
    public static void main(String[] args) {
        // Break Statement
        int i=1;
        while(i<=5){
          if(i==3)
          {
            break;
        }
        System.out.println(i);
        i++;
    }

        // Continue Statement
        int j=1;
        while(j<=10){
            
            if(j==5){
                j++;
                continue;
            }
            System.out.println(j);
            j++;

        }
    }
}
