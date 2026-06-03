package PART_1_Basics.LEC_5_Hashing;

import java.util.LinkedHashMap;

public class Hash6_Reverse {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> h1 = new LinkedHashMap<>();
        h1.put(1, 11);
        h1.put(2, 35);
        h1.put(3, 12);
        System.out.println(h1);

        LinkedHashMap<Integer,Integer> h2 = new LinkedHashMap<>();
        
        for(Integer key : h1.keySet()){
            h2.put(h1.get(key),key);
        }

        System.out.println(h2);
    }
}
