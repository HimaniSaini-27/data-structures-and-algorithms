/* 4

PROBLEM: Given an integer N, return true it is an Armstrong number otherwise return false.

SOLUTION:

Armstrong Number : An Armstrong number is a number that is equal to the sum of its digits raised 
to the power of the number of digits.
Example 153 = 1^3 + 5^3 + 3^3 = 153
        1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634

I] Brute Force Approach: 
    -Firsty, we find no. of digits. 
    -We store remainder/digit in some var and add its power to M.
    -Negative numbers are not armstrong by definition.
    -TC:O(log10(n)+1)   
    -SC:O(1)

*/

package PART_1_Basics.LEC_2_Basic_Maths;

public class LEC4_Armstrong_Number {
    public static void main(String[] args) {

        int n = 153;
        System.out.println(armstrong(n));
    }

    static boolean armstrong(int n) {

        if (n < 0) {
            return false;
        }

        if (n == 0) {
            return true;
        }

        int x = n;
        int sum = 0;
        int count = (int) Math.log10(n) + 1;

        while (x > 0) {
            int r = x % 10;
            sum += (int) Math.pow(r, count);
            x = x / 10;
        }

        return n == sum;
    }
}

