package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("laxmi", 10);
        h.put("shreemaa", 20);
        h.put("sudha",30);

        System.out.println(h);
        System.out.println(h.size());

        for (Map.Entry<String,Integer> e : h.entrySet())
            System.out.println(e.getKey()+ " : "+ e.getValue());
    }

}
