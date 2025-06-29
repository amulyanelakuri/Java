import java.util.Scanner;
public class TowersofHanoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Disks : ");
        int n = sc.nextInt();

        int moves = (int)Math.pow(2,n) - 1;
        System.out.println("minimum number of moves: " +moves);
        sc.close();

    }
    
}
