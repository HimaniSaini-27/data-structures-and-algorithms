package PART_1_Basics.LEC_5_Hashing;
import java.util.HashMap;

public class Hash4_Hashmap_Character {
     public static void main(String[] args){
        String s  = "abcdeabcab";
        int n = s.length();
        
        HashMap<Character,Integer> h = new HashMap<>();

        for(int i=0;i<n;i++){
            char key = s.charAt(i);
            int freq = h.getOrDefault(key, 0);
            freq++;
            h.put(key,freq);
        }

        for(Character key : h.keySet()){
            System.out.println(key +" -> "+h.get(key));
        }
        
        

    }
}
