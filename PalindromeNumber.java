import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println(n+ " is a palindrome");
        }
        else{
            System.out.println(n+" it is not a palindrome ");
        }
        sc.close();
    }
    

        public static boolean isPalindrome(int n){
            int rev =0;
            int original = n;
            while(n != 0){
                int rem = n% 10;
                 rev = rev *10+rem;
                n /= 10;
            }
            return original == rev;
        }
    }

    
