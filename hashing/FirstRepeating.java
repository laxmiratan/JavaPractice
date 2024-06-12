package hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeating {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int[] arr1 = {1, 2, 3, 4};
        System.out.println(firstRepeated(arr1,4));
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i = 0; i< n; i++){
            if(map.containsKey(arr[i]) && map.get(arr[i]) >1 )
                return i+1;
        }
        return -1;
    }
}
