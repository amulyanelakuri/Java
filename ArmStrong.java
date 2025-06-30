import java.util.Scanner;
public class ArmStrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int temp =n;
        int rev =0;

        while(n>0){
            int digit = n %10;
            rev = digit*digit*digit+rev;
            n = n/10;
        }
        if(temp==rev){
            System.out.println(temp + " is a ArmStrong Number");

        }
        else{
            System.out.println( temp + " is not a ArmStrong Number");
        }
        sc.close();



    }
    
}
