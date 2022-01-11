package baitap.ArrayList;

import java.util.Arrays;

public class MyListBT<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyListBT() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Tăng gấp đôi kích thước mảng
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Tạo độ dài mảng
    public MyListBT(int capacity) {
        elements = new Object[capacity];
    }

    //Hiển thị mảng
    public void display() {
        for (Object o : elements) {
            if (o != null) {
                System.out.println(o);
            }
        }
    }

    //Thêm phần tử vào vị trí index
    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            size++;
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
        }
    }

    //Xóa phần tử ở vị trí index
    public E remove(int index) {
         E result;
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            result = (E) elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        return result;
    }

    //Lấy số lượng phần tử
    public int size() {
        return size;
    }

    //Sao chép mảng
    public E[] clone() {
        E[] arrayNew;
        arrayNew = Arrays.copyOf((E[])elements, size);
        return arrayNew;
    }

    //Kiểm tra phần tử có nằm trong mảng
    public boolean contains(E e) {
        for (Object o : elements) {
            if (e.equals(o))
                return true;
        }
        return false;
    }

    //Tìm vị trí của phần tử e đầu tiên
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e)
                return i;
        }
        return -1;
    }

    //Kiểm tra xem có thêm được phần tử
    public boolean add(E e) {
        return size < elements.length;
    }

    //Hiển thị phần tử
    public E get (int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    //Clear
    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }
}
