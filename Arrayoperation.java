import java.util.Scanner;
public class Arrayoperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] array = new int[n];

        for(int i =0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int result = operations(array);
        System.out.println(result);
        sc.close();
        
    }
    public static int operations(int[] array){
        int sum =0;
        for(int i =0;i<array.length;i++){
            sum +=  array[i];
        }
        return sum;
    }
}
