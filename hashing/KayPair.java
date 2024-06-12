package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KayPair {

    public static void main(String[] args) {
        int n = 6, x = 18;
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(hasArrayTwoCandidates(arr,n,x));
    }
    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        boolean flag = false;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i < n; i++){
            if(set.contains(x - arr[i])){
                flag = true;
                break;
            }
            set.add(arr[i]);
        }

        return flag;
    }
}
