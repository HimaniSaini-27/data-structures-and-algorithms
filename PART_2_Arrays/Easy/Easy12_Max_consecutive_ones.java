/*
PROBLEM: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

OA:
-A counter is incremented while 1s are encountered and reset when a 0 appears.
 The maximum value is updated whenever the streak ends and once after the loop.
 Time Complexity: O(N)
 Space Complexity: O(1)
*/

package PART_2_Arrays.Easy;

public class Easy12_Max_consecutive_ones {
    public static void main(String args[]){
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int n = arr.length;

        int max = 0 , M = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==1){
                max++;
            }
            else{
                M = Math.max(max,M);
                max = 0;
            }
        }
        M = Math.max(max,M);
        System.out.println(M);
    }

}
