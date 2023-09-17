public class NestedTryDemo {
     public static void main(String[] args) {
    //try-catch inside another try catch
//inner try-catch can acess outer try catch
try{
    try{
        int x = 25 , y=0;
        int div = x/y;
        System.out.println(div);
    }catch(ArrayIndexOutOfBoundsException a)
    {
        System.out.println(a);
}
}
catch(Exception a)
{
    System.out.println(a);
}
         System.out.println("Code after catch block");
    }
    
}