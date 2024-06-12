package hashing;

import java.util.HashMap;

public class CountPair {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int n = 4, k = 6;
        System.out.println(getPairsCount(arr,n,k));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(mp.containsKey(k-arr[i])){
                count+=mp.get(k-arr[i]);
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}
