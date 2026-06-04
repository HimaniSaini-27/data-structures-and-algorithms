/*
Problem Statement: Given an array, find the second largest element in the array.(The second largest element must be strictly smaller than the largest.)

Solution:

I]Brute Force approach:
  - First sort the array
  - Find the second largest element from the last by using the largest element. Skip duplicates when finding second largest.
  TC: O(NlogN + N)  SC:O(1)/O(N)

II]Optimal Approach: 
   - Initialize large with the first element and second with Integer.MIN_VALUE.
   - Traverse the array and update second with large and large with current whenever a larger element is found.
   - Update second with current if an element larger than second and smaller than large is found.
   TC: O(N)  SC:O(1)

*/

package PART_2_Arrays.Easy;

public class Easy2_Second_largest_element {
    public static void main(String[] args){

        int[] arr = {8, 7, 5, 4, 9, 1};

        if (arr.length < 2) {
            System.out.println("-1");
            return;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
