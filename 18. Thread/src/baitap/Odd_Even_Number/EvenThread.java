package baitap.Odd_Even_Number;

public class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Lẻ: " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
