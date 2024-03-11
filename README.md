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
