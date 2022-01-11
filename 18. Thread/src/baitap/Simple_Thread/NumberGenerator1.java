package baitap.Simple_Thread;

public class NumberGenerator1 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Printing " + i);
                System.out.println(hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
