package PART_1_Basics.LEC_5_Hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash5_Hashmap_Methods {
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();

        //put
        m.put("Himani",100);
        m.put("Saini",101);
        m.put("Amrik",102);
        m.put("Singh",103);

        //print
        System.out.println(m);

        //update
        System.out.println(m.put("Singh", 104));
        System.out.println(m);

        //get
        System.out.println(m.get("Himani"));

        //keySet
        Set s = m.keySet();
        System.out.println(s);

        //Values
        Collection c = m.values();
        System.out.println(c);

        //entrySet
        Set s1 = m.entrySet();
        System.out.println(s1);

        //Iterator and Map.Entry
        Iterator it = s1.iterator();
        while(it.hasNext()){
            Map.Entry m1 = (Map.Entry)it.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(m1.getKey().equals("Amrik")){
                m1.setValue(200);
            }
            System.out.println(m1);
        }

        //remove
        m.remove("Singh");
        System.out.println(m);

        //containsKey
        System.out.println(m.containsKey("Himani"));
        System.out.println(m.containsKey("Singh"));

        //MergeHashmap-putAll
        HashMap<Integer,Integer> h1 = new HashMap<>();
        h1.put(1, 100);
        h1.put(2, 101);
        h1.put(3, 102);
        HashMap<Integer,Integer> h2 = new HashMap<>();
        h2.put(2,101);
        h2.put(4,103);
        h2.put(5,104);

        h1.putAll(h2);
        System.out.println(h1);

        //isEmpty
        System.out.println(m.isEmpty());
        h2.clear();
        System.out.println(h2.isEmpty());

        

    }
}
