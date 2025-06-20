import java.util.Scanner;
public class Floatoperations {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the a value: ");
    float a = sc.nextFloat();
    System.out.print("Enter the b Value: ");
    float b = sc.nextFloat();
    System.out.printf("%.5f",a+b);
    }
}
