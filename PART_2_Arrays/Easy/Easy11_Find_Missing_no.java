/*
PROBLEM: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

I]BFA:
-For every number from 1 to N, we check whether it exists in the array.
 If a number is not found during the inner loop, it is the missing number.
 Time Complexity: O(N^2)
 Space Complexity: O(1)

 II]BA:
-frequency array of size N+1 is used where index represents the number.
 First loop marks the presence of elements in the array.
 Second loop finds the index whose frequency is zero, which is the missing number.
 Time Complexity: O(2N)
 Space Complexity: O(N)

 OR

-HashMap Approach:
Array elements are stored as keys in a HashMap to mark their presence.
Then numbers from 1 to N are checked, and the number not present in the map
is printed as the missing number.
Time Complexity: O(2N)
Space Complexity: O(N)

 III]OA1:
-The expected sum of numbers from 1 to N is calculated using N*(N+1)/2.
 The actual sum of array elements is computed.
 The difference between the two sums gives the missing number.
 Time Complexity: O(N)
 Space Complexity: O(1)

 IV]OA2: BEST
-We take XOR of all numbers from 1 to N and XOR of all array elements.
 All common numbers cancel out due to XOR property (a^a = 0).
 The remaining value is the missing number.
 Time Complexity: O(N)
 Space Complexity: O(1)

*/

package PART_2_Arrays.Easy;
import java.util.*;
public class Easy11_Find_Missing_no {
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6,7};
        int N = 7;
        int n = arr.length;

        //BFA
        // for(int i=1;i<=N;i++){
        //     int flag = 0;
        //     for(int j=0;j<n;j++){
        //         if(i==arr[j]){
        //             flag++;
        //             break;
        //         }
        //     }
        //     if(flag == 0){
        //         System.out.println(i);
        //     }
        // }

        //BA
        // int hash[] = new int[N+1];

        // for(int i=0;i<n;i++){
        //     hash[arr[i]]++;
        // }
        // for(int i=1;i<=N;i++){
        //     if(hash[i]==0){
        //         System.out.println(i);
        //     }
        // }

        //OR
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(m.containsKey(key)){
                freq = m.get(key);
            }
            freq++;
            m.put(key,freq);
        }
        for(int i=1;i<=N;i++){
            if(!m.containsKey(i)){
                System.out.println(i);
            }
        }

        //OA1
        // int sum1 = (N*(N+1))/2;
        // int sum2 = 0;
        // for(int i=0;i<n;i++){
        //     sum2+=arr[i];
        // }
        // System.out.println(sum1-sum2);

        //OA2
        // int xor1 = 0, xor2 = 0;
        // for(int i=0;i<n;i++){
        //     xor2 = xor2^arr[i];
        //     xor1 = xor1^(i+1);
        // }
        // xor1 = xor1^N;//if starting from 0, just remove this line.
        // System.out.println(xor1^xor2);

    }
}
