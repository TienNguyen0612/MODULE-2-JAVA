package baitap.Prime_Factorization;

public class Main {
    public static void main(String[] args) {
        LazyPrime lazyPrime = new LazyPrime();
        OptimizedPrime optimizedPrime = new OptimizedPrime();

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread1.start();
        thread2.start();
    }
}
