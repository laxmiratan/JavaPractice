package hashing;

import java.util.Collections;
import java.util.HashSet;

public class UnionOfUnsortedArray {

    public static void union(int[] a, Integer[] b){
        HashSet<Integer> h = new HashSet<>();
        Collections.addAll(h, b);
        for(int i : a)
            h.add(i);
        System.out.println(h);
    }

    public static void main(String[] args) {
        int[] a = {10,20,20,10,10};
        Integer[] b = {30,30,30,30};
        union(a,b);
    }
}
