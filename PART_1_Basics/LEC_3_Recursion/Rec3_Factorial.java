//TC:O(N)  SC:O(N)

package PART_1_Basics.LEC_3_Recursion;

public class Rec3_Factorial {
    
    public static void main(String args[]){
        int n = 5;
        System.out.println(fact(n));

    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
