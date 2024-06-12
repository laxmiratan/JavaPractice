package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int l= 0;
        int h = arr.length - 1;

        while(l < h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
