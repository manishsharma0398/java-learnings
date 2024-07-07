/**
 * MergeSort
 */
public class MergeSort {
    public static void divideAndConquer(int arr[], int lb, int up) {
        if (lb >= up)
            return;
        int mid = (lb + up) / 2;
        divideAndConquer(arr, lb, mid);
        divideAndConquer(arr, mid + 1, up);
        merge(arr, lb, mid, up);
    }

    public static void merge(int arr[], int lb, int mid, int up) {
        int mergedArr[] = new int[up - lb + 1];
        int i = lb;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= up) {
            if (arr[i] <= arr[j]) {
                mergedArr[k] = arr[i];
                i++;
            } else {
                mergedArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            mergedArr[k] = arr[i];
            k++;
            i++;
        }

        while (j <= up) {
            mergedArr[k] = arr[j];
            k++;
            j++;
        }

        for (int k1 = 0, k2 = lb; k2 < mergedArr.length; k1++, k2++) {
            arr[k2] = mergedArr[k1];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        divideAndConquer(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }
}

// Time complexity n log (n)