import java.util.Scanner;
public class SumNuminRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // Starting value
        int n = sc.nextInt(); // ending value
        int result = rangeSum(m, n);
        System.out.print(" "+result);
        sc.close();

    }
    public static int rangeSum(int m,int n){
        int sum =0;
        for(int i =m;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    
    }
    
}
