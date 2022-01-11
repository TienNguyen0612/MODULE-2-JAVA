package baitap.BT_Stack;

public class ReverseArrayStringByStack {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        String string = "Welcome to My Stack";
        String[] strings = string.split("\\s");

        System.out.println("String Array is:");
        for (String s : strings) {
            System.out.print(s + "\t");
        }
        System.out.println();

        for (String s : strings) {
            myStack.push(s);
        }

        for (int i = 0; i < strings.length; i++) {
            strings[i] = myStack.pop();
        }

        System.out.println("After Reverse String Array is:");
        for (String s : strings) {
            System.out.print(s + "\t");
        }
    }
}
