import java.util.Scanner;
public class Fibbnacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N = sc.nextInt();
        int start=0;
        int end=1;

        for(int i=0;i<N;i++){
            int fib = start+end;
            System.out.print(start+" ");
            start=end;
            end= fib;
        }
    }
}
