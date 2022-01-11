package baitap.Odd_Even_Number;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        try {
            oddThread.start();
            oddThread.join();
            evenThread.start();
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
    }
}
