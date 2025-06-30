public class ProductArrayExceptSelf {
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        int[] result = fixedNum(array);
        for (int val : result) {
            System.out.print(val + " ");
        }

        
    }
    public static int[] fixedNum(int[] array){
        int n = array.length;
        int[] output = new int[n];

//Intialization of output
       output[0] = 1;
       for (int i = 1; i < n; i++) {
        //left pass
       output[i] = output[i - 1] * array[i - 1];
}


        int right = 1;
        //right pass
        for (int i = n - 1; i >= 0; i--) {
          output[i] *= right;
          right *= array[i];
}
return output;

    }
    
    
}
/*
 * input : 1,2,3,4
 * At zero: 2*3*4 = 24
 * At one : 1*3*4 = 12
 * At Two : 1*2*4 = 8
 * At Three : 1*2*3 = 6
 */