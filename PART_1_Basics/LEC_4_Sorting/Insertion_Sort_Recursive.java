package PART_1_Basics.LEC_4_Sorting;

public class Insertion_Sort_Recursive {
    public static void main(String args[]){
        int[] arr = {6,8,9,4,3,2};
        int n = 6;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        ISR(arr,n,1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void ISR(int[] arr,int n,int i){
        if(i>=n){
            return;
        }
        int key = arr[i];
        int j =i-1;
        while(j>=0 && key < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
        ISR(arr, n, i+1);
     }
}
