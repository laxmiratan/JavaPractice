package arrays;

import java.util.Arrays;

public class LeftRotateByD {

    public static void rotate(int[] arr, int n, int d){
        int[] temp = new int[d];

        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

        for(int i = d; i < n; i++){
            arr[i-d] = arr[i];
        }

        for(int i = 0; i < d; i++){
            arr[n+i-d] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        /*
        Input: arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
        Output: 3 4 5 6 7 1 2

        Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
        Output: 5 6 7 1 2 3 4
        */
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = arr.length;
        rotate(arr,n,d);


    }

}
