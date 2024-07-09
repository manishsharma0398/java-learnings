/**
 * QuickSort
 */
public class QuickSort {
    public static void swap(int[] arr, int lb, int up) {
        int temp = arr[lb];
        arr[lb] = arr[up];
        arr[up] = temp;
    }

    public static int partition(int[] arr, int lb, int up) {
        int pivot = arr[lb];
        int start = lb;
        int end = up;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, lb, end);
        return end;
    }

    public static void quickSort(int[] arr, int lb, int up) {
        if (lb > up)
            return;
        int pivotIdx = partition(arr, lb, up);
        quickSort(arr, lb, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, up);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 0, 4, 1, 9, 2 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}