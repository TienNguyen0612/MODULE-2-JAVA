package optional;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        int first = 0;
        int last = list.length - 1;
        int number = 59;
        System.out.println(binarySearch(list, number, first, last));
    }


    public static int binarySearch(int[] arr, int value, int first, int last) {
        if (last >= first) {
            int mid = (first + last) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                last = mid - 1;
                return binarySearch(arr, value, first, last);
            } else {
                first = mid + 1;
                return binarySearch(arr, value, first, last);
            }
        }
        return -1;
    }
}
