
/**
 * InsertionSort
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 1; i < arr.length; i++) {
            int selected = arr[i];
            int maxIndexSortedArr = i - 1;
            while (maxIndexSortedArr >= 0 && selected < arr[maxIndexSortedArr]) {
                arr[maxIndexSortedArr + 1] = arr[maxIndexSortedArr];
                maxIndexSortedArr--;
            }
            arr[maxIndexSortedArr + 1] = selected;
        }

        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }
}