package arrays;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void move(int[] arr, int n){
        int l = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[l++] = arr[i];
            }
        }

        while(l < n){
            arr[l++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        move(arr,n);
    }

}
