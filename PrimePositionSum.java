import java.util.Scanner;
public class PrimePositionSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number (x y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = getNthPrime(x);
        int b = getNthPrime(y);

        int c = (a + b) - 1;
        System.out.print(c + " ");
        sc.close();
        
    }
    public static int getNthPrime(int n){
        int count = 0;
        int num = 1;
        while(count < n){
            num++;
            if(isPrime(num)) count++;

        }
        return num;


    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
}
