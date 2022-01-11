package thuchanh.Queue_LinkedList;

public class MyLinkedListQueue {
    private MyNode head;
    private MyNode tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        MyNode temp = new MyNode(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public MyNode dequeue() {
        if (this.head == null)
            return null;
        MyNode temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
