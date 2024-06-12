package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctDigits {

    public static int countDist(int[] arr, int n){
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < n; i++){
            h.add(arr[i]);
        }

        return h.size();
    }

    public static void main(String[] args) {
        int[] arr = {10,20,10,30,20,40};
        int n = arr.length;
        System.out.println(countDist(arr,n));

        Integer[] arr1 = {10,20,10,30,20,40};
        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr1));
        System.out.println(s.size());
    }

}
