import java.util.Scanner;
public class ArithmeticCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Operator: ");
        char character = sc.next().charAt(0);
        if(character == '/' && num2==0){
            System.out.print("Error:Division by zero");
        }
        else {
            switch(character){
                case '+':
                System.out.println(num1+num2);
                break;
                case '-':
                System.out.println(num1-num2);
                break;
                case '*':
                System.out.println(num1*num2);
                break;
                case '/':
                System.out.println(num1/num2);
                break;
                default:
                System.out.println("Invalid operation: ");
                break;
            }
        }

    }
    
}
