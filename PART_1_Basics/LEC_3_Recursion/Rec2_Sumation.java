//TC:O(N)  SC:O(N)

package PART_1_Basics.LEC_3_Recursion;

public class Rec2_Sumation {
    public static void main(String args[]){
        int n = 5;
        System.out.println(sum(n));

    }

    static int sum(int n){
        if(n<1){
            return 0;
        }
        return n+sum(n-1);
    }
    
}
