/*6
PROBLEM:  Given an integer N, check whether it is prime or not.

SOLUTION:

Prime Number: A number greater than 1 having exactly two divisors: 1 and itself.

I] Brute Force Approach:
   -Check all numbers from 1 to N
   -If divisor count is exactly 2, the number is prime.
   TC: O(N)
   SC: O(1)

II] Optimal Approach:
   If i divides N, then N/i also divides N
   TC: O(√N)
   SC: O(1)
*/


package PART_1_Basics.LEC_2_Basic_Maths;

public class LEC6_Prime_Number {
    public static void main(String[] args) {

        int n = 17;

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
