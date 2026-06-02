//TC: O(2ⁿ)    SC:(N)

package PART_1_Basics.LEC_3_Recursion;

public class Rec6_Fibonacci {
    public static void main(String args[]){
        int n = 5;
        System.out.println(Fibonacci(n));
    }

    static int Fibonacci(int n){
        if(n<=1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
