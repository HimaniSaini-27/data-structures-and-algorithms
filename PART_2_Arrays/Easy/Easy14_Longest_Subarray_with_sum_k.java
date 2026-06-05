/*
PROBLEM:  Given an array nums of size n and an integer k, find the length of the longest sub-array 
that sums to k. If no such sub-array exists, return 0. 

I]BFA
-TC: O(n^2)
-SC: O(1)

II]BA----for all 
-TC: O(n) or O(n^2) or O(nlogn)
-SC: O(n)

III]OA----only +ves
-TC: O(2n)
-SC: O(1)

*/

package PART_2_Arrays.Easy;

//import java.util.*;

public class Easy14_Longest_Subarray_with_sum_k {

    public static void main(String args[]){
        int nums[] = {10, 5, 2, 7, 1, 9};
        int k = 15;  
        int n = nums.length;

        // //BFA-Generate all subarrays  TC: O(n^2)  SC: O(1)
        // int len = 0;
        // int sum = 0;
        // for(int i=0;i<n;i++){
        //     sum =0;
        //     for(int j = i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum > k){
        //             break;
        //         }
        //         else if(sum==k){
        //             sum = 0;
        //             len = Math.max(len, j-i+1);
        //         }
        //     }
        // }
        // System.out.println(len);

        //BA-Hashing
        // Map<Integer,Integer> m = new HashMap<>();
        // int sum =0;
        // int len =0;
        // for(int i=0;i<n;i++){
        //     sum+=nums[i];
        //     if(sum==k){
        //         len = Math.max(len,i+1);
        //     }
        //     int rem = sum-k;

        //     if(m.containsKey(rem)){
        //         len = Math.max(len, i-m.get(rem));
        //     }

        //     if(!m.containsKey(sum)){
        //         m.put(sum,i);
        //     }
        // }
        // System.out.println(len);

        //OA
        int sum =0;
        int len =0;
        int i=0,j=0;
        while(j<n){
            sum += nums[j];
            
            while(sum>k && i<=j){
                    sum-=nums[i];
                    i++;
            }
    
            if(sum==k){
                len = Math.max(len, j-i+1);
            }
            j++;
        }
        System.out.println(len);



        

    }
}
