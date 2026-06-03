/*
Optimal Approach (Using HashMap):

1. Create an empty HashMap<Integer, Integer> h.
   - Key = element in the array
   - Value = frequency of that element

2. Traverse the array:
   - For each element 'key':
       a) If key is already present in HashMap, get its frequency
       b) Increment frequency by 1
       c) Put key and updated frequency back in the HashMap

3. Traverse the HashMap (using keySet() or entrySet()) and print frequencies.

Time Complexity: O(N)       // each element processed once
Space Complexity: O(K)      // stores all unique elements

**Fast access, no order: HashMap
  Sorted keys or range queries: TreeMap


**Highest Occurring Element in an Array

class Solution {
    public int mostFrequentElement(int[] arr) {
        int n = arr.length;

        TreeMap<Integer,Integer> h= new TreeMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(h.containsKey(key)){
                freq = h.get(key);
            }
            freq++;
            h.put(key,freq);
        }

        int maxv = Integer.MIN_VALUE;
        int maxk = Integer.MIN_VALUE;
        for(Integer key : h.keySet()){
            if(h.get(key)>maxv){
                maxk = key;
                maxv = h.get(key);
            }
        }
        return maxk;
    }
}


*/



package PART_1_Basics.LEC_5_Hashing;
import java.util.Arrays;
import java.util.HashMap;

public class Hash3_Hashmap_Number {
    public static void main(String args[]){
        int[] arr = {1,7,8,6,4,9,3,4,5,1,2,3,5,5};
        int n = arr.length;

        HashMap<Integer,Integer> h= new HashMap<>();
        
        //BFA
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(h.containsKey(key)){
                freq = h.get(key);
            }
            freq++;
            h.put(key,freq);
        }
        for(Integer key : h.keySet()){
            System.out.println(key +" -> "+h.get(key));
        }
        h.clear();
        System.out.println();

        //OA
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = h.getOrDefault(arr[i], 0);
            freq++;
            h.put(key,freq);
        }
        for(Integer key : h.keySet()){
            System.out.println(key +" -> "+h.get(key));
        }
        System.out.println();

        //Majority Element
        int max =0;
        int result = 0;
        for(Integer key : h.keySet()){
            if(h.get(key)>max){
                max = h.get(key);
                result = key;
            }
        }
        System.out.println("Majority Element: "+result);
        System.out.println();


        //Display Duplicates
        System.out.println("Duplicates:");
         for(Integer key : h.keySet()){
            if(h.get(key)>1){
            System.out.println(key +" -> "+h.get(key));
            }
        }
        System.out.println();

        //No. of duplicates and unique element array
        int[] b = new int[h.size()];
        int i =0;
         for(Integer key : h.keySet()){
            b[i] = key;
            i++;
        }
        System.out.println("Total Unique:" + h.size());
        System.out.print("Unique Element Array:");
        System.out.println(Arrays.toString(b));

    }
}
