/*
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

Solution:
 
I]Brute Force Approach:
  -Declare a set and insert all the elements of the array into the set.
  -The number of unique elements in array is equal to size of the set.
  -Traverse the set and fill the first k indices with elements in set.
  TC: O(N + N + N)  SC: O(N)

II]Optimal Approach:
   - Begin at the first position, which will always be part of the final unique list.
   - Move through the list one item at a time, comparing the current item with the most recently kept unique item.
   - If the current item is the same as the last kept one, skip it because it’s a duplicate.
   - If it’s different, place it right after the last kept unique item to keep all unique values grouped at the front.
   - Continue until every element in the list has been checked. The first part of the list now contains all the unique values in their original order, and the rest can be ignored.
   - TC:O(N)  SC:O(1)
   - *Total unique elements = j+1

*/

package PART_2_Arrays.Easy;
import java.util.*;

public class Easy4_Remove_duplicates_from_sorted_array {

    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,3};

        //BFA
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int index = 0;
        for (int num : set) {
            arr[index++] = num;
        }

        for (int i = 0; i < set.size(); i++) {
            System.out.print(arr[i] + " ");
        }


        //OA
        // int j = 0;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]!=arr[j]){
        //         arr[j+1]=arr[i];
        //         j++;
        //     }
        // }

        // for(int i=0;i<=j;i++){
        //     System.out.print(arr[i]+" ");
        // }

    

    }
    
}
