import java.util.Scanner;
public class PalindromeofaString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int length  = str.length();
        boolean palindrome = true;
        
        for(int i=0;i<length/2;i++){
            if(str.charAt(i) != str.charAt(length-1-i)){
                palindrome = false;
                break;
            }
            
        }
        if(palindrome){
            System.out.println( str + " is a Palindrome");
        }
        else{
            System.out.println(str + " is not a Palindrome");
        }
        sc.close();
        
    }
}

