import java.util.Scanner;
public class FirstOccuranceIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to Find:");
        int n = sc.nextInt();

        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.print("Enter the elements in array");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int index =-1;
        for(int i=0;i<size;i++){
            if (arr[i]==n){
                index = i;
                break;
            }
        }
        System.out.println(n);
        sc.close();

    }
    
}
