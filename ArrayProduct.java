import java.util.Scanner;
public class ArrayProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array:");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i =0;i<n;i++){
            array[i] = sc.nextInt();
        }
        arrayProduct(array);
        System.out.println(arrayProduct(array));
        sc.close();
    }
    public static int arrayProduct(int[] array){
        int num = array.length;
        int product = 1;
            
    for(int i =0;i<num;i++){
        
        product *= array[i];
    }
    return product;
}

    
}
