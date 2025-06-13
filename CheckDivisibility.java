import java.util.Scanner;
public class CheckDivisibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num1: ");
        int Num1 = sc.nextInt();
        System.out.print("Enter the Num2: ");
        int Num2 = sc.nextInt();

        if(Num1%3==0 && Num1%5==0){
            System.out.println("Divisible by Both 3 and 5");
        }
        else{
            System.out.println("Not Divisible by Both 3 and 5");
        }
        if(Num2%3==0 && Num2%5==0){
            System.out.println("Divisible by Both 3 and 5");
        }
        else{
            System.out.println("Not Divisible by Both 3 and 5");
        }

    }

}