package Searching;

public class InterPolationSearchDemo {

    public static int list[] = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44};

    public static void main(String[] args) {

        int location = find(33);

        // if element was found 
        if (location != -1)
            System.out.println("\nElement found at location: " + (location + 1));
        else
            System.out.println("Element not found.");

    }

    private static int find(int data) {
        int lo = 0;
        int hi = list.length - 1;
        int mid = -1;
        int comparisons = 1;
        int index = -1;

        while (lo <= hi) {
            System.out.printf("\nComparison %d  \n", comparisons);
            System.out.printf("lo : %d, list[%d] = %d\n", lo, lo, list[lo]);
            System.out.printf("hi : %d, list[%d] = %d\n", hi, hi, list[hi]);

            comparisons++;

            mid = (int)(lo + (((double) (hi - lo) / (list[hi] - list[lo])) * (data - list[lo])));
            System.out.printf("mid = %d\n", mid);

            if (list[mid] == data) {
                index = mid;
                break;
            } else {
                if (list[mid] < data) {
                    // if data is larger, data is in upper half
                    lo = mid + 1;
                } else {
                    // if data is smaller, data is in lower half
                    hi = mid - 1;
                }
            }
        }
        System.out.printf("\nTotal comparisons made: %d", --comparisons);
        return index;
    }
}
