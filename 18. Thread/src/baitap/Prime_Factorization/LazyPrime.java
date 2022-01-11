package baitap.Prime_Factorization;

public class LazyPrime implements Runnable {
    @Override
    public void run() {
        int count = 0, n = 2;
            while (count < 50) {
                if (isPrime(n)) {
                    System.out.println("Lazy: " + n);
//                    Thread.sleep(1000);
                    count++;
                }
                n++;
            }
    }

    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            int i = 2;
            while (i < n) {
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
