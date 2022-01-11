package baitap.BT_Stack;

public class ReverseArrayIntegerByStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        Integer[] integers = new Integer[6];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        integers[4] = 5;
        integers[5] = 6;
        System.out.println("Integer Array is:");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + "\t");
        }
        System.out.println();

        for (Integer integer : integers) {
            myStack.push(integer);
        }

        for (int i = 0; i < integers.length; i++) {
            integers[i] = myStack.pop();
        }

        System.out.println("After Reverse Integer Array is: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + "\t");
        }
    }
}
