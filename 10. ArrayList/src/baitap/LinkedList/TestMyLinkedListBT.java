package baitap.LinkedList;

public class TestMyLinkedListBT {
    public static void main(String[] args) {
        MyLinkedListBT<Integer> linkedListBT = new MyLinkedListBT<>(1);
        linkedListBT.add(1,2);
        linkedListBT.add(2,3);
        linkedListBT.add(3,4);
        linkedListBT.add(4,5);

        System.out.println("In List: ");
        linkedListBT.printList();
        System.out.println("Trả về phần tử thứ 2: ");
        System.out.println(linkedListBT.remove(2));
        linkedListBT.addFirst(10);
        linkedListBT.addLast(11);
        linkedListBT.add(2, 11);
        System.out.println("In List sau khi thêm: ");
        linkedListBT.printList();
        System.out.println("Kiểm tra phần tử có hay không: ");
        System.out.println(linkedListBT.contains(12));
        System.out.println("Trả về vị trí đầu tiên của phần tử: ");
        System.out.println(linkedListBT.indexOf(11));
        System.out.println("Trả về phần tử có hay không và xóa vị trí đầu tiên: ");
        System.out.println(linkedListBT.remove1(11));
        System.out.println("In List sau khi xóa: ");
        linkedListBT.printList();
        System.out.println("Trả về các phần tử: ");
        System.out.println(linkedListBT.get(2));
        System.out.println(linkedListBT.getFirst());
        System.out.println(linkedListBT.getLast());
    }
}
