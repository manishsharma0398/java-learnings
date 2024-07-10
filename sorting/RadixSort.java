import java.util.Arrays;

/**
 * RadixSort
 */
public class RadixSort {
    static int getMax(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr, int n, int pos) {
        int[] countArr = new int[10];
        Arrays.fill(countArr, 0);
        for (int i = 0; i < n; i++) {
            countArr[(arr[i] / pos) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            countArr[i] += countArr[i - 1];
        }

        int[] sortedArr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            sortedArr[--countArr[(arr[i] / pos) % 10]] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sortedArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 432, 8, 530, 90, 88, 231, 11, 45, 677, 199, 386, 549 };
        int maxNumber = getMax(arr);
        for (int pos = 1; (maxNumber / pos) > 0; pos *= 10) {
            countSort(arr, arr.length, pos);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}