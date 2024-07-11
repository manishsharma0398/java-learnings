package search;

/**
 * BinarySearchRecursive
 */
public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int x, int lb, int up) {
        if (lb > up)
            return -1;
        int mid = (lb + up) / 2;
        if (arr[mid] == x) {
            return mid;
        }
        if (x > arr[mid]) {
            return binarySearch(arr, x, mid + 1, up);
        } else {
            return binarySearch(arr, x, lb, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 8, 10, 16, 33, 58, 85, 99 };
        int x = 33;
        int index = binarySearch(arr, x, 0, arr.length - 1);
        System.out.println(x + " is at " + index + " index");
    }
}