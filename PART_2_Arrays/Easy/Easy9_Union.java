/*
PROBLEM: Union of Two Sorted Arrays

I]BFA:
- Add elements of arr1 and arr2 in set
- Now create an array union to store union of the array of size of set
- Now add all the element of set in union
- TC:O(NlogS+MlogS+N+M)  SC: O(N+M)

II]OA:
- We use the two-pointer technique since both arrays are sorted.
Two pointers traverse arr1 and arr2 simultaneously and the smaller element
is added to the union list. If both elements are equal, only one is added.
To avoid duplicates, we add an element only if it is different from the
last inserted element in the union list. After one array is exhausted,
remaining elements of the other array are added while skipping duplicates.
- TC: O(N+M)  SC: O(N+M)

*/


package PART_2_Arrays.Easy;
import java.util.*;

public class Easy9_Union {
    public static void main(String args[]){

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};
        int n = arr1.length;
        int m = arr2.length;

        //BFA
        // LinkedHashSet<Integer> s = new LinkedHashSet<>();
        // for(int i=0;i<n;i++){//O(NlogS)
        //     s.add(arr1[i]);
        // }
        // for(int i=0;i<m;i++){//O(MlogS)
        //     s.add(arr2[i]);
        // }

        // int union[] = new int[s.size()];
        // int k =0;
        // for(int num : s){//O(N+M)
        //     union[k] = num;
        //     k++;
        // }

        //OA
         List<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
            else { 
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        for (int x : union) {
            System.out.print(x + " ");
        }
    }

    
}
