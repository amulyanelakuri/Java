import java.util.Scanner;
public class Powercalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the Exponent Value: ");
        int exponent = sc.nextInt();
        int power = calculator(base,exponent);
        System.out.println(power);
        
    }
    public static int calculator(int base,int exponent){
        int result = 1;
        for(int i=0;i<exponent;i++){
            result *= base;
        }
        return result;

    }
    
}
