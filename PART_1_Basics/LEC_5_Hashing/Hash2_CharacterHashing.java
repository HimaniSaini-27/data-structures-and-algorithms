/*2
PROBLEM STATEMENT: Given a string, we need to find frequency of each character(a-z).

OA:
-Create hasharray for no. of max character.
-'a'=0, 'b'=1..... Therefore use hash[s.charAt(i)-'a']++;
-If we are considering all symbols, we can go with hash[s.charAt(i)]++;
-TC and SC -same

*/

package PART_1_Basics.LEC_5_Hashing;

public class Hash2_CharacterHashing {
    public static void main(String[] args){
        String s  = "abcdeabcab";
        int n = s.length();
        int hash[] = new int[26]; 

        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            char c = (char)(i + 'a');
            System.out.println(c + " : "+ hash[i]);
        }
    }
}
