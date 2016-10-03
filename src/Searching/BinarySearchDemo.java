package Searching;

public class BinarySearchDemo {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int srcElm = 0;
        int len = list.length;
        int left = 0;
        int right = len - 1;
        int mid;
        int index = 0;

        while (left <= right) {

            mid = left + (right - left) / 2;
            if (srcElm == list[mid]) {
                index = list[mid];
                break;
            } else if (srcElm > list[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index == 0)
            System.out.println("element not found");
        else
            System.out.println("Element found at location : " + index);
    }
}
