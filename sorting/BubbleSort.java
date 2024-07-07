/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int data[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < data.length - 1; i++) { // runs for n-1 times
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.err.print(data[i] + " ");
        }
    }
}