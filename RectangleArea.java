import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length: ");
    int length = sc.nextInt();
    System.out.println("Enter the width:");
    int width = sc.nextInt();
    double area = calculateRectangle(length,width);
    System.out.println("area of the Triangle: "+area);
    }
    public static double calculateRectangle(double length,double width){
        return length*width;
    }
}
    

