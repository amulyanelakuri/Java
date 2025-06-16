import java.util.Scanner;
public class SumofFloat {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Float value: ");
     float number = sc.nextFloat();
     int decimal = (int) number;

     int sum =0;
     while(decimal>0){
        sum+=decimal%10;
        decimal/=10;
     }
     System.out.println(sum);
    }
}
