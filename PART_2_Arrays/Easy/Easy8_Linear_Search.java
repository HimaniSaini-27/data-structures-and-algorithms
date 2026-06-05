/*
PROBLEM:Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1. 

TC: O(N)
SC: O(1)

*/

package PART_2_Arrays.Easy;

public class Easy8_Linear_Search {
    public static void main(String args[]){

        int arr[] = {1,9,5,7,6,1,2,8};
        int n = 8;
        int target =2;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                System.out.println("Found "+target+" at index: "+i );
            }
        }
    }
}
