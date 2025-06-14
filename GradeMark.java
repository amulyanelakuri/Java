import java.util.Scanner;
public class GradeMark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt(); 

        System.out.println(gradeCheck(marks1));
        System.out.println(gradeCheck(marks2));
        System.out.println(gradeCheck(marks3));

    }

    public static String gradeCheck(int marks){
        if(marks >90){
            return "A";
        }
        else if(marks >70){
            return "B";
        }
        else if(marks >=40){
           return "C";
        }
        else{
            return "Fail";
            
        }
    }
  
}
