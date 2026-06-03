package PART_1_Basics.LEC_4_Sorting;

public class Quick_Sort {
    public static void main(String[] arg) {
        int[] arr = {4, 8, 3, 7, 5, 1, 6};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[], int low, int high) {
        if (low < high) {
            int par = partition(arr, low, high);
            sort(arr, low, par - 1);
            sort(arr, par + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int p = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] < p) {
                i++;
            }
            while (j > low && arr[j] > p) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                break;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
