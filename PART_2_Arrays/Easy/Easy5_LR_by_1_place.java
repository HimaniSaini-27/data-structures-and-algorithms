/*
PROBLEM: Left rotate an array by 1 place.

OA:
-store the first element in temp
-shift the remaining elements forward by one place
-place temp at last index
-TC: O(N)   SC: O(1)

*/


package PART_2_Arrays.Easy;

public class Easy5_LR_by_1_place {
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7};
        int n = 7;

        if (n <= 1) return;

        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    } 
}
