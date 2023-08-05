import java.util.Scanner;


public class ArrayDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        // create array of size n
        int[] arr = new int[n];
          // ask user to enter elements of array
          System.out.println("Enter the elements of the array:");
          for(int i= 0; i<n;i++){
            arr[i] = s.nextInt();
          }
          // display numbers divisible by 2 and 3
        System.out.print("Numbers divisible by 2 and 3 in the array are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        s.close();
    }
    
}
