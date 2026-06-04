/*
PROBLEM: Left rotate an array by d places.

I]BFA:
-do d modulo n, and make temp array
-store elements upto d in temp array
-move other elements by d places forward
-store elements in temp array at back
-TC: O(n-d) , SC: O(d)

II]OA:
-reverse elements till d places
-reverse leftover
-reverse complete array
-TC: O(2N) , SC: O(1)

*/

package PART_2_Arrays.Easy;

public class Easy6_LR_by_d_places {
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7};
        int n = 7;
        int d = 3;
        d = d % n;

        if (n <= 1) return;

        //BFA
        //int b[] = new int[d];
        // for(int i=0;i<d;i++){//O(d)
        //     b[i] = arr[i];
        // }
        // for(int i=d;i<n;i++){//O(n-d)
        //     arr[i-d] = arr[i];
        // }
        // for(int i=n-d;i<n;i++){//O(d)
        //     arr[i]=b[i-(n-d)];
        // }

        //OA-Left
        // reverse(arr, 0, d-1);//O(d)
        // reverse(arr, d, n-1);//O(n-d)
        // reverse(arr, 0,n-1);//O(n)

        //OA-Right
        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, n-1);
        reverse(arr, 0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    } 

    static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
