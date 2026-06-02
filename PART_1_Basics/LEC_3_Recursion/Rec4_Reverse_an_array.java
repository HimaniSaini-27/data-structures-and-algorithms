//TC:O(N)  SC:O(N)

package PART_1_Basics.LEC_3_Recursion;

public class Rec4_Reverse_an_array {
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Reverse(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void Reverse(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        Reverse(arr, i + 1, j - 1);
    }
}
