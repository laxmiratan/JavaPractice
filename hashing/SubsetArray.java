package hashing;

import java.util.*;

public class SubsetArray {

//    public static boolean subset(int[] arr1, int[] arr2){
//        Set<Integer> set = new HashSet<>();
//        for (int j : arr2) {
//            set.add(j);
//        }
//
//        for(int i = 0; i < arr1.length; i++){
//            int finalI = i;
//            set.removeIf(x -> x == arr1[finalI]);
//        }
//        if (!set.isEmpty())
//            return false;
//        else
//            return true;
//    }

    public static String subset(long[] a1, long[] a2){
        boolean flag = true;
        Map<Long, Integer> map = new HashMap<>();
        for(long l : a2){
            map.put(l, map.getOrDefault(l,0)+1);
        }

        for (long l : a1){
            if (map.containsKey(l)){
                map.put(l, map.get(l)-1);
            }
        }

        for(Map.Entry<Long, Integer> e : map.entrySet()){
            if (e.getValue() > 0) {
                return "No";
            }
        }


        return "Yes";
    }

    public static void main(String[] args) {
        long[] arr1 = {1,2,3,4,5,1,1,1};
        long[] arr2 = {1,2,3,1};
        System.out.println(subset(arr1, arr2));
    }
}
