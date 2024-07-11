package search;

/**
 * BinarySort
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int n, int x) {
        int lb = 0;
        int up = n;
        while (lb <= up) {
            int mid = (lb + up) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                lb = mid + 1;
            } else {
                up = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 8, 10, 16, 33, 58, 85, 99 };
        int x = 33;
        int index = binarySearch(arr, arr.length - 1, x);
        System.out.println(x + " is at " + index + " index");
    }
}