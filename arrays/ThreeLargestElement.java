package arrays;

import java.util.Arrays;

public class ThreeLargestElement {

    public static void large(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //in for loop print last 3 digits
    }

    public static void largest(int[] arr, int n){
        int first, second, third;
        if(n < 3){
            System.out.println("Invalid");
            return;
        }
        first = second= third = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }else if (arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println(first+ " "+ second+" "+third);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr1 = { 1, 2};
        int n = arr.length;
        large(arr);
        largest(arr1, n);
    }
}
