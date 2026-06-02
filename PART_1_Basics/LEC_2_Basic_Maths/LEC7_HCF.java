/*7
PROBLEM:  Given two integers N1 and N2, find their greatest common divisor.
SOLUTION:

I] Brute Force Approach:Iterate from 1 to minimum of two numbers.
   TC: O(min(n1,n2))
   SC: O(1)

II] Better Approach:Iterate from minimum of two numbers to 1. Break when first divisor is found.
   TC: O(min(n1,n2))
   SC: O(1)

III] Optimal Approach:
   Euclidean Algorithm: The GCD of two numbers remains the same even if the smaller number is
   subtracted from the larger number.
   To find the GCD of n1 and n2 where n1 > n2:
      1. Repeatedly subtract the smaller number from the larger number until one of them becomes 
      0.
      2. Once one becomes 0, the other is the GCD of the original numbers.
   TC: O(log of min(n1,n2))
   SC: O(1)
*/

package PART_1_Basics.LEC_2_Basic_Maths;

public class LEC7_HCF {
    public static void main(String arg[]){
        int n1 = 48;
        int n2 = 36;
        System.out.println(HCF3(n1, n2));
    }

    static int HCF1(int n1,int n2){
        int h=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                 h = i;
            }
        }

        return h;
    }

    static int HCF2(int n1,int n2){
        int h=1;
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                 h = i;
                 break;
            }
        }

        return h;
    }

     static int HCF3(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>=n2){
                n1-=n2;
            }
            else{
                n2-=n1;
            }
        }
        if(n1==0){return n2;}
        else{return n1;}
    }
    
}
