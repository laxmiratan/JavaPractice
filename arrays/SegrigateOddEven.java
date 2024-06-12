package arrays;

import java.util.Arrays;

public class SegrigateOddEven {
/*
    Input: arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5}
    Output: 2 4 6 8 7 9 1 3 5

    Input: arr[] = {1, 3, 2, 4, 7, 6, 9, 10}
    Output:  2 4 6 10 7 1 9 3

 */

    static void segrigate(int[] arr, int n){
        int[] temp = arr.clone();

        int min = 0, max = n-1;
        for(int i = 0; i< n; i++){
            if(temp[i] % 2 == 0)
                arr[min++] = temp[i];
            else
                arr[max--] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        segrigate(arr,n);
        System.out.println(Arrays.toString(arr));
    }


}
