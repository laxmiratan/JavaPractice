package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyLimitedRangeArrayElement {

    public static void main(String[] args) {
        /*
        Input:
        N = 5
        arr[] = {2, 3, 2, 3, 5}
        P = 5
        Output:
        0 2 2 0 1
        Explanation:
        Counting frequencies of each array element
        We have:
        1 occurring 0 times.
        2 occurring 2 times.
        3 occurring 2 times.
        4 occurring 0 times.
        5 occurring 1 time.
        */
        int n = 5;
        int[] arr = {2, 3, 2, 3, 5};
        int p = 5;
        frequencyCount(arr, n, p);

    }

    public static void frequencyCount(int[] arr, int N, int P)
    {
        // code here
        Map<Integer, Integer> mp = new LinkedHashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = mp.getOrDefault(i+1, 0);
        }

    }
}
