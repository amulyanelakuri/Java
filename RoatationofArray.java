import java.util.Scanner;
public class RoatationofArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the Array elements:");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int first = arr[0];
        int second = arr[1];

        // Shift the elements  to forward
        for (int i = 0; i < n - 2; i++) {
            arr[i] = arr[i + 2];
        } 
        arr[n-2]= first;
        arr[n-1]= second;

        System.out.print("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    
}
