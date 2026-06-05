/*
PROBLEM: Intersection of an array.

OA:
-Since both arrays are sorted, we use two pointers to traverse them.
If elements at both pointers are equal, the element is added to the
intersection list and both pointers are moved forward.
If the current element of arr1 is smaller, pointer i is moved;
otherwise, pointer j is moved. This ensures linear traversal.
Time Complexity: O(N + M)
Space Complexity: O(min(N, M))  

*/

package PART_2_Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Easy10_Intersection {
    public static void main(String args[]){

        int arr1[] = {1,2,4,5,5,7};
        int arr2[] = {2,3,4,4,5,6,7};
        int n = arr1.length;
        int m = arr2.length;

        //OA
        List<Integer> Common = new ArrayList<>();
        int i=0,j=0;

        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                Common.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
            
        }

        for(int num : Common){
            System.out.print(num+" ");
        }
        
    }
}
