public class Angram {
    public static void main(String[] args){
        String s1 = "abaac";
        String s2 = "aabca";
        method(s1, s2);
        


    }
    public static void method(String s1,String s2){
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty() || s1.length() != s2.length()) {
            System.out.println("Invalid Input");
            return;
        }
        int[] frequency = new int[256];
        for(char c: s1.toCharArray()){
            frequency[c]++;
        }
        for(char c: s2.toCharArray()){
            frequency[c]--;
        }
        for(int result : frequency){
            if( result != 0){
            System.out.print("FALSE");
            return;
            }
        }

            System.out.println("True");
        }
    }
    

