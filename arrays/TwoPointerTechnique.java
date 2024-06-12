package arrays;

import java.util.Arrays;

public class TwoPointerTechnique {

    /*
    Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
    Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

    Input: arr[] = {1, 2, 3, 4, 5, 6}
    Output: arr[] = {6, 1, 5, 2, 4, 3}
 */

    public static void reArrange(int[] arr, int n){
        int[] temp = arr.clone();
        boolean flag = true;
        int max = n-1, min = 0;

        for(int i = 0; i<n; i++){
            if(flag)
                arr[i] = temp[max--];
            else
                arr[i] = temp[min++];

            flag = !flag;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        reArrange(arr,n);
        System.out.println(Arrays.toString(arr));
    }

}
