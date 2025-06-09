import java.util.Scanner;
public class SumofArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int sum =0;

        System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
             sum += arr[i];
        }
        
        System.out.println("Sum of the array elements is: " + sum);
        sc.close();

    }
}