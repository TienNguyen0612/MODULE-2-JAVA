package baitap.BT_Queue_lienketvong;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enQueue(10);
        solution.enQueue(20);
        solution.enQueue(30);
        solution.enQueue(40);
        System.out.println(solution.deQueue().data);
        System.out.println(solution.deQueue().data);
        System.out.println("-----------");
        solution.enQueue(100);
        solution.enQueue(50);
        solution.displayQueue();
    }
}
