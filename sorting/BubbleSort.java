/**
 * BubbleSort
 */
public class BubbleSort {
    public static void swap(int[] arr, int lb, int up) {
        int temp = arr[lb];
        arr[lb] = arr[up];
        arr[up] = temp;
    }

    public static void main(String[] args) {
        int data[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}