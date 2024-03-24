# Java
# Unicode Systems
// Unicode characters in Java
char ch1 = 'A'; // ASCII character represented in Unicode
char ch2 = '\u00A9'; // Copyright symbol represented in Unicode
//Unicode contain Supplymentary Charaterrs
// Handling supplementary characters in Java
String text = "𐍈 is a supplementary character";
int codePoint = text.codePointAt(0); // Retrieves the code point of the first character

# Lexical Structure
// 1.Inditifiers
int age;
String firstName;
double _salary;
// 2.Keywords
int num;
double amount;
String name;
// 3.Literals
int age = 30;
double pi = 3.14;
String message = "Hello, Java!";
char grade = 'A';
boolean isActive = true;
// 4.Operators
int a = 10;
int b = 5;
int sum = a + b;
boolean isGreater = a > b;
boolean isTrue = true;
boolean result = isTrue && (a != b);
// 5.teriminator
public class HelloWorld {
 public static void main(String[] args) {
 System.out.println("Hello, Java!");
 }
}
# locla variables
import java.util.*;

public class MyClass {
    public void calculateSum() {
      
      / ********************************************************************************  
    // ✏️✏️️✏️ WRITE CODE HERE   **  
     
  // *********  
        
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Create an instance of the class that contains the calculateSum() method
        MyClass myClass = new MyClass();
        // Call the calculateSum() method
        myClass.calculateSum();
    }
}
# non static variables
public class Circle {
  
   
  // ********************************************************************************  
   //Declare instance variables
    // ✏️✏️️✏️ WRITE CODE HERE   **  
     
  // ******************************************************************************** 
    
  public void calculateArea() {
        area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle circle = new Circle();

        // Set the radius of the circle
        circle.radius = 5.0;

        // Call the calculateArea() method
        circle.calculateArea();
    }
}
# static variables
public class Circle {
    public void calculateArea() {
       
     // ********************************************************************************  
    // ✏️✏️️✏️ WRITE CODE HERE   **  
     
  // ********************************************************************************  
       
        double radius = 5.0;
        double area = **Write your code here **;
        
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle circle = new Circle();

        // Call the calculateArea() method
        circle.calculateArea();
    }
}
# NEW CHAPATER 
# Interduction
import java.util.*;
{
 public static void main (string[]args)
 {
   System.out.println(12);
   }
 }
# printing the text
import java.util.*;
{
public static void main(string args[])
{
System.out.print("guithub");
  }
}
# printing arithmetic operations
import java.util.*;
{
 public static void main(string args[])
 {
 System.out.println(12+12);
    }
 }
 # initialize the variables 
 import java.util.*;
 {
 public class main(string args[])
 {
   int length=12;
   int breadth=14;
   System.out.println(length*breadth);
   System.out.println(2*(length+breadth));
      }
   }
   # printing TEXT WITH NUMBERS
   import java.util*;
   {
public static void main(sting[]args)
{
Systm.out.println("2 times 5 is"+(2*5));
System.out.println("The numeric value of twenty three is " + 23);
}

 }
 
