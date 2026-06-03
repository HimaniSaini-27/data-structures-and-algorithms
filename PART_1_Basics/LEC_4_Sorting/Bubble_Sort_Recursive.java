package PART_1_Basics.LEC_4_Sorting;

public class Bubble_Sort_Recursive {
    public static void main(String args[]){
        int[] arr = {6,8,9,4,3,2};
        int n = 6;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        BSR(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void BSR(int[] arr, int n){
        int swap = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap = 1;
            }
        }
        if(swap==0){
            return;
        }
        BSR(arr, n-1);
    }
}
