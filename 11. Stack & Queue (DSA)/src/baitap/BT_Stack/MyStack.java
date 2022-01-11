package baitap.BT_Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
