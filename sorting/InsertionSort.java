
/**
 * InsertionSort
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int maxSortedArrIndex = i - 1;
            while (maxSortedArrIndex >= 0 && current < arr[maxSortedArrIndex]) {
                arr[maxSortedArrIndex + 1] = arr[maxSortedArrIndex];
                maxSortedArrIndex--;
            }
            arr[maxSortedArrIndex + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }
}