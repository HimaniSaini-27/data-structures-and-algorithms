/*
PROBLEM: Move all Zeros to the end of the array

I]BFA:
- Make a new array of same size and add only the non-zero elements.
- Fill the remaining with 0
- TC: O(N+N)  SC: O(N)

II]OA:
- Firstly, find the position of first 0 as j
- Keep two pointers i and j, i iterates and j points the position of 0
- start from i=j+1, if element is not zero, swap i with j and j++
                    if element is zero, i++
- TC: O(N)    SC: O(1)


*/


package PART_2_Arrays.Easy;

public class Easy7_Move_zeros_to_end {
    public static void main(String args[]){

        int[] arr = {1,2,0,8,0,0,3,4,0};
        int n = 9;

        //BFA
        // int b[] = new int[n];
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0){
        //         b[j]=arr[i];
        //         j++;
        //     }
        // }
        // for(int i=j;i<n;i++){
        //     b[i] = 0;
        // }

        //OA
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }

        if(j!=-1){
        for(int i=j+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
