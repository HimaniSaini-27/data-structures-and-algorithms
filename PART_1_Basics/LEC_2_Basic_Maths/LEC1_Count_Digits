/* 1
PROBLEM: Given an integer N, return the number of digits in N

I] Brute Force Approach:
    -When we do N%10 we get remainder and when we do N/10 the last digit is removed. Hence, the 
    digits are extracted in reverse order. N>0 is stopping condition.
    -No. of digits = No. of times N is divisible by 10 = No. of iterations. We use a count 
    variable to count iterations.
    -It handles negative number.
    -If N = 0, answer is 1
    -TC:O(log10(n)+1)
    -SC:O(1)

II] Optimal Approach: 
    -Use log10 function in Math
    -Works only for N > 0
    -Handle N = 0 separately as it leads to infinity
    -If N is negative, convert it to positive using Math.abs()
    -TC:O(1)  SC:O(1)

  * Why does log10 give the number of digits?
    Every increase in the number of digits in a number happens when the number crosses a power of 10.
    Number of digits = floor(log10(N)) + 1

    log10(9) ≈ 0.95
    floor(0.95) = 0
    digits = 0 + 1 = 1

    log10(10) = 1
    digits = 1 + 1 = 2

    log10(11) ≈ 1.04
    floor(1.04) = 1
    digits = 1 + 1 = 2

*/

package PART_1_Basics.LEC_2_Basic_Maths;

public class LEC1_Count_Digits {
    public static void main(String[] args) {

        // Brute Force Approach

        // int n = -7789;              
        // if (n == 0) {
        // System.out.println(1);
        // } 
        //else {
        // int count = 0;
        // while (n != 0) {
        // count++;
        // n = n / 10;
        // }
        // System.out.println(count);
        // }


        // Optimal Approach

        int n = -7789;
        n = Math.abs(n);

        if (n == 0) {
            System.out.println(1);
        } else {
            int count = (int) Math.log10(n) + 1;
            System.out.println(count);
        }

    }

}
