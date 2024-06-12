package hashing;

import java.util.Collections;
import java.util.HashSet;

public class IntersectionOfArrays {

    static void intersect(int[] a, Integer[] b){
        HashSet<Integer> h = new HashSet<Integer>();
        Collections.addAll(h, b);

        for (int i : a)
            if(h.contains(i))
                System.out.println(i);
    }

    public static void main(String[] args) {

        int[] arr1 = { 10, 20,30};
        Integer[] arr2 = {30,20,10 ,50};
        intersect(arr1,arr2);
    }

}
