package recursion;

public class isArraySorted {
    public static boolean isArraySortedAscending(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        return isArraySortedAscending(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 5 };
        boolean data = isArraySortedAscending(arr, 0);
        System.out.println("is array sorted ? " + data);
    }
}
