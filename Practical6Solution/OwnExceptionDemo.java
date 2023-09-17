class NegativeVolumeException extends Exception{
    public String toString(){
        return "Volume cannot be negatuve. please provide +ve value.";
                }
}
class Box{
    public void calcVolume(int length, int breadth, int height) throws NegativeVolumeException
    {
        if(length < 0 || breadth< 0 || height <0)
        {
            throw new NegativeVolumeException();
        }
        else
        {
            System.out.println("Volume is "+(length*breadth*height));
        }
        }
}
public class OwnExceptionDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        try{
            b1.calcVolume(2, 30, -10);
            
                
              
        }
        catch(NegativeVolumeException n){
            System.out.println(n);
        }
        
        System.out.println("After use of exception");
        
        
    }
}
