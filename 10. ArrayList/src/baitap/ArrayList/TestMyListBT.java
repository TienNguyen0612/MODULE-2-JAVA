package baitap.ArrayList;


import java.util.Arrays;

public class TestMyListBT {
    public static void main(String[] args) {
        MyListBT<Integer> lists = new MyListBT<>();
        lists.add(0, 5);
        lists.add(0, 6);
        lists.add(0, 7);
        lists.add(0, 7);
        lists.add(0, 7);
        lists.add(2, 100);

        System.out.println(lists.remove(2));
        System.out.println(lists.remove(2));
        System.out.println("------------------");
        lists.display();

        System.out.println(lists.size());
        System.out.println("------------------");
        System.out.println("Clone:");
        System.out.println(Arrays.toString(lists.clone()));
        System.out.println("------------------");
        System.out.println("Contains:");
        System.out.println(lists.contains(3));
        System.out.println("------------------");
        System.out.println("indexOf:");
        System.out.println(lists.indexOf(8));
        System.out.println("------------------");
        System.out.println("Boolean add:");
        System.out.println(lists.add(4));
        System.out.println("------------------");
        System.out.println("Get elements[i]:");
        System.out.println(lists.get(2));
        System.out.println("------------------");
        System.out.println("Clear:");
    }
}
