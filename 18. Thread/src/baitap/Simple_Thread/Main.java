package baitap.Simple_Thread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator1 numberGenerator1 = new NumberGenerator1();

        Thread thread = new Thread(numberGenerator);
        Thread thread1 = new Thread(numberGenerator1);

        thread.start();
        thread1.start();
    }
}
