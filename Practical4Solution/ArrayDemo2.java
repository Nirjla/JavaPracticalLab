public class ArrayDemo2 {
    public static void main(String[] args) {
         // create array of integers of size 30
         int[] arr = new int[30];

         // store 30 integers in the array
         for (int i = 0; i < 30; i++) {
             arr[i] = i + 1;
         
         System.out.println(arr[i]);}
 
         // display integers between 16 and 47
         System.out.print("Integers between 16 and 47 in the array are: ");
         for (int i = 0; i < 30; i++) {
             if (arr[i] >= 16 && arr[i] <= 47) {
                 System.out.print(arr[i] + " ");
             }
         }
    }
    
}
