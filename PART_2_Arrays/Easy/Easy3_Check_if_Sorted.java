/*
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False

Solution:
- Traverse the array.
- Compare each element with the next one.
- If any element is greater than the next, the array is not sorted.

TC: O(N)  SC: O(1)

**Check if array is sorted and rotated
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}

*/


package PART_2_Arrays.Easy;

public class Easy3_Check_if_Sorted {

    public static void main(String[] args){

        int[] arr = {1,2,3,6,7,9};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Not Sorted");
                return;
            }
        }
        System.out.println("Sorted");
        return;
    }
    
}
