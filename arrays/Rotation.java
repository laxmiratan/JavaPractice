package arrays;

import java.util.Arrays;

public class Rotation {

    public static void rotate(int[] arr, int n, int d) {
        int c = 1;
        while (d>=c){
            int last = arr[0];
            for(int i = 0; i< n-1; i++){
                arr[i] = arr[i+1];
            }
            c++;
            arr[n-1] = last;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateTemp(int[] arr, int n, int d){
        int[] temp = new int[n];
        for (int i = 0; i < d; i++){
            temp[n-d+i] = arr[i];
        }

        for (int i = d; i < n ; i++){
            temp[i-d] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        // Rotate 2 times
        int d = 2;

        rotate(arr, n, d);

        rotateTemp(arr1, n ,d);
    }
}
