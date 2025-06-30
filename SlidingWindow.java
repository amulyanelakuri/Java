public class SlidingWindow {
    public static void main(String[] args){
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.print("Maximum in each window: ");
        slidingWin(arr, k);
      

    }
    public static void slidingWin(int[] arr,int k){
        int n = arr.length;
        if(n<k || k<=0){
            System.out.println("Invalid output");
        }
        for(int i =0;i<=n-k;i++){
            int max = arr[i];
            for(int j = i+1 ; j < i+k ; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }

    
}
