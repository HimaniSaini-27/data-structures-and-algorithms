/* 1

PROBLEM: Given an array, find the frequency of each element.

I] Brute Force Approach:
- For each query, traverse the entire array and count occurrences.
- TC: O(Q * N)
- Inefficient for large inputs (may cause TLE). 
*-If length of the query-10^5 and the array size-10^5, the time complexity will be O(10^10). And 10^8 operations take 1 second to get executed. So, 10^10 operations will take around 100 seconds(10^10/10^8). We cannot say a code is good.

**HASHING
-Hashing is a technique to store and access data quickly by converting a value into an index (key) using a hash function, so operations like search, insert, and count happen in O(1) time (average).
-The combination of the steps, pre-storing, and fetching.

I] Optimal Approach:
- Create a hash array of size (maxElement + 1) and initialize it with 0 (Automatic in java).
- Pre-storing: Traverse the array and increment hash[arr[i]].
  TC: O(N)
- Fetching: Return hash[number].
  TC: O(1)
-Extra space used = size of hash array. SC: O(K)
*-NOTE:
--Works only when elements are non-negative and within a small range.
-- For large values (e.g., 10^9), use HashMap instead of array.

*/

package PART_1_Basics.LEC_5_Hashing;

public class Hash1_Hasharray {
    public static void main(String[] arg){

        //OA
        int[] arr = {1,7,8,6,4,9,3,4,5,1,2,3,5,5};
        int n = arr.length;
        int[] hash = new int[15];

        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        for(int i=0;i<15;i++){
            System.out.println(i + " : "+ hash[i]);
        }
     }

}
