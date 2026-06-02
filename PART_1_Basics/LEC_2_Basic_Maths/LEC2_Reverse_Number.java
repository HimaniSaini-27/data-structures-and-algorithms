/*2

PROBLEM: Given an integer N, return the reverse of the given number.

I] Brute Force Approach:
- Append the digit to the result using:
  reverse = reverse * 10 + digit.
- It handles negative number.
- Trailing zeros in N are removed automatically during reversal.
- Reverse of 0 is 0.
Time Complexity: O(log10(n) + 1)
Space Complexity: O(1)



public int reverse(int x) {
        int n =0;
        while(x!=0){
            int rem = x%10;
            x/=10;
            if(n > Integer.MAX_VALUE/10 || n == Integer.MAX_VALUE/10 && rem > 7){
                return 0;
            }
            if(n < Integer.MIN_VALUE/10 || n == Integer.MIN_VALUE/10 && rem < -8){
                return 0;
            }
            n = n*10 + rem;
        }
        return n;
    }
*/



package PART_1_Basics.LEC_2_Basic_Maths;

public class LEC2_Reverse_Number {
    public static void main(String[] args) {

        int n = -7789600;
        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println(rev);
    }
}

