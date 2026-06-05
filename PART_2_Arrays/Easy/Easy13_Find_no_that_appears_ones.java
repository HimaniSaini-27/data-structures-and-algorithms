/*
PROBLEM:Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

I]BFA:
Each element is compared with every other element to count its frequency.
The element whose frequency is exactly one is printed as the unique element.
Time Complexity: O(N^2)
Space Complexity: O(1)

II]BA:
A HashMap is used to store array elements as keys and their frequencies as values.
After counting frequencies, the map is traversed to find the element
whose frequency is exactly one.
Time Complexity: O(N)
Space Complexity: O(N)

III]OA:
Iterates through the array and computes the XOR of all elements.
Properties of XOR (a^a=0, a^0=a) are useful to find unique numbers.
Time Complexity: O(N)
Space Complexity: O(1)
*/

package PART_2_Arrays.Easy;
// import java.util.*;

public class Easy13_Find_no_that_appears_ones {
    public static void main(String args[]){
        int arr[] = {4,1,2,1,2};
        int n = arr.length;

        //BFA
        // for(int i=0;i<n;i++){
        //     int count =0;
        //     for(int j=0;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count ==1){
        //         System.out.println(arr[i]);
        //         break;
        //     }
        // }

        //BA
        // Map<Integer,Integer> m = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     int key = arr[i];
        //     int freq = 0;
        //     if(m.containsKey(key)){
        //         freq = m.get(key);
        //     }
        //     freq++;
        //     m.put(key,freq);
        // }
        // for(Map.Entry<Integer,Integer> e : m.entrySet()){
        //     if(e.getValue()==1){
        //         System.out.println(e.getKey());
        //     }
        // }

        //OA
        int xor =0;
        for(int i=0;i<n;i++){
            xor = xor^arr[i];
        }
        System.out.println(xor);
    }
}
