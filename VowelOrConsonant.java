import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the character: ");
        char character = sc.next().charAt(0);
        switch(character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
             System.out.println("Vowel");
             break;
             default:
             System.out.println("Consonant");
        } 
    }
}
