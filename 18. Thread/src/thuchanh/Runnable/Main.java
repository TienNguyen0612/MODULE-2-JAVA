package thuchanh.Runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunanbleDemo runanbleDemo1 = new RunanbleDemo("Thread-1-HR-Database");
        runanbleDemo1.start();

        RunanbleDemo runanbleDemo2 = new RunanbleDemo("Thread-2-Send-Email");
        runanbleDemo2.start();

        System.out.println("Main thread stopped!!!");
    }
}
