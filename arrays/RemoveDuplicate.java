package arrays;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void dumpDuplicate(int[] arr, int n){
        int[] temp = new int[n];
        temp[0] = arr[0];

        int res = 1;

        for(int i = 1; i<n; i++){
            if(temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};
        int n = arr.length;
        dumpDuplicate(arr,n);
    }

}
