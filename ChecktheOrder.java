import java.util.Scanner;
public class ChecktheOrder {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a>b && b>c){
        System.out.println("Decresing");
    }
    else if (a<b && b<c){
        System.out.println("Incresing");
    }
    else{
        System.out.println("Neither Incresing and decresing");
    }
}
    
}
