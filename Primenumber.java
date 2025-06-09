import java.util.Scanner;
public class Primenumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;
        while(i*i<=n){           
            if (n % i == 1) {
                System.out.println("It is Prime number");
                break;
            }
            else{
                System.out.println("It is Not a prime number");
                break;
            }

        }
    }

    
}
    

