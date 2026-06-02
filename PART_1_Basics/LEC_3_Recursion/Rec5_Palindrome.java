//TC:O(N)  SC:O(N)

package PART_1_Basics.LEC_3_Recursion;

public class Rec5_Palindrome {
    public static void main(String args[]){
        String s = "madam";
        int n = s.length();
        System.out.println(Palindrome(s,0,n-1));
    }


    static boolean Palindrome(String s, int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return Palindrome(s, i+1, j-1);
    }
}
