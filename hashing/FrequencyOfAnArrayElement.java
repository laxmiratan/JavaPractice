package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfAnArrayElement {

    public static void main(String[] args) {
        int[] arr = {10,20,10,30,20,40};

        HashMap<Integer, Integer> h = new HashMap<>();
        for (int j : arr) {
            h.put(j, h.getOrDefault(j,0)+1);
        }

        for (Map.Entry<Integer,Integer> e : h.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());

//for maintain actual order

        LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();
        for (int j : arr)
            lh.put(j, lh.getOrDefault(j,0)+1);

        for (Map.Entry<Integer,Integer> e : lh.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());
    }

}
