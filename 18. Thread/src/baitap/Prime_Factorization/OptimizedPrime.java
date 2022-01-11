package baitap.Prime_Factorization;

public class OptimizedPrime implements Runnable {
    @Override
    public void run() {
        int count = 0, N = 2;
            while (count < 50) {
                if (isPrime(N)) {
                    System.out.println("Optimize: " + N);
                    count++;
                }
                N++;
            }
    }

    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
