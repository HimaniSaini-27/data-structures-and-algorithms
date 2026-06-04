/*
Problem Statement: Given an array, we have to find the largest element in the array. 

Solution:

I]Brute Force approach: First sort the array and print the last element.
  TC: O(NlogN)  SC:O(1)/O(N)

II]Optimal Approach: 
   - Initialize a variable with the first element.
   - Traverse the array and update it whenever a larger element is found.
   TC: O(N)  SC:O(1)

*/

package PART_2_Arrays.Easy;

public class Easy1_Largest_element {
    public static void main(String[] args){
        
        int[] arr = {8,7,5,4,9,1};

        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest< arr[i]){
                largest = arr[i];
            }
        }

        System.out.println("Largest Element: "+largest);
    }
}
