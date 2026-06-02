/*5
PROBLEM: Given an integer N, print all its divisors.

SOLUTION:

I] Brute Force Approach:
   Check all numbers from 1 to N
   TC: O(N)
   SC: O(1)

II] Optimal Approach:
   If i divides N, then N/i also divides N
   TC: O(√N)
   SC: O(1)

Q: Why do we loop till √N?
--Because divisors occur in pairs, and one of them must be ≤ √N.

Q: Why check i != n/i?
--To avoid printing the square root twice for perfect squares.

*/



package PART_1_Basics.LEC_2_Basic_Maths;

public class LEC5_Divisors {
    public static void main(String[] args) {

        int n = 36;

        //Brute Force Approach 
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }

        //Optimal Approach 
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
        
    }

}

