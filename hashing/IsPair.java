package hashing;

import java.util.HashSet;

public class IsPair {

    public static boolean pair(int[] a, int sum){
        HashSet<Integer> h = new HashSet<>();
        for(int i : a) {
            if (h.contains(sum - i))
                return true;
            else {
                h.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {8,3,4,2,5};
        int sum = 6;
        System.out.println(pair(a,sum));
    }
}
