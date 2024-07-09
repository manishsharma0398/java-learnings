public class SelectionSort {
    public static void swap(int[] arr, int lb, int up) {
        int temp = arr[lb];
        arr[lb] = arr[up];
        arr[up] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    swap(arr, smallest, j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }
}
