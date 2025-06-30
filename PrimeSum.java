public class PrimeSum {
    
    public static void main(String[] args) {
        int M = 6;
        int N = 2;
        System.out.println(sumOfPrimes(M, N));  // Expected output: 49
    }

    public static int sumOfPrimes(int M, int N) {
        int num = 2;    // candidate number
        int index = 0;  // tracks prime position
        int sum = 0;

        while (index < M + N) {
            if (isPrime(num)) {
                index++;
                if (index >= M) {
                    sum += num;
                }
            }
            num++;
        }

        return sum;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

    

