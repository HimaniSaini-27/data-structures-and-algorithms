/* 3

PROBLEM: Given an integer N, return true if it is a palindrome else return false.

SOLUTION:

I] Brute Force Approach:
    -Making a copy of N is necessary as we have to compare N an M in end.
    **-Negative numbers are not palindromes because the minus sign appears only on one side.
    -TC:O(log10(n)+1)
    -SC:O(1)


public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int m = x, n =0;
        while(m != 0){
            int rem = m % 10;
            m/=10;
            if(n > Integer.MAX_VALUE/10 || n == Integer.MAX_VALUE/10 && rem > 7){
                return false;
            }
            n = n*10 + rem;
        }
        return x == n;
    }

*/

package PART_1_Basics.LEC_2_Basic_Maths;

public class LEC3_Palindrome {
    public static void main(String[] args) {

    int n = 123321;
    System.out.println(palindrome(n));
    }

    static boolean palindrome(int n) {
        if(n<0){
            return false;
        }
    
        int x = n;
        int m = 0;

        // Brute Force Approach
        while (x > 0) {
            int r = x % 10;
            m = m * 10 + r;
            x = x / 10;
        }
        return n == m;

    }

}
