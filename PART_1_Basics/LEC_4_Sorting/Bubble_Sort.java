package PART_1_Basics.LEC_4_Sorting;

public class Bubble_Sort {
    public static void main(String[] arg){
        int[] arr = {4,8,3,7,5,1,6};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Bubble(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void Bubble(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            int swap = 0;   

            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = 1;
                }
            }

            if(swap == 0){
                break;
            }
        }
    }
}

