import java.util.Scanner;
public class CheckPosorNeg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(positive(num1));
        System.out.println(positive(num2));

    }
    public static String positive(int num){
        if(num ==0){
            return "Zero";
        }
        else if(num <0){
            return "Negative";
        }
        else{
            return "positive";
        }
    }
}
