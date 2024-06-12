package arrays;

public class MaxDifference {

    public static int maxDiff(int[] arr, int n){

        int res = arr[1] - arr[0];
        int minVal = arr[0];

        for(int i = 1; i < n; i++){
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int n = arr.length;
        System.out.println( maxDiff(arr, n));
    }
/*
    Input : arr = {2, 3, 10, 6, 4, 8, 1}
    Output : 8
    Explanation : The maximum difference is between 10 and 2.

    Input : arr = {7, 9, 5, 6, 3, 2}
    Output : 2
    Explanation : The maximum difference is between 9 and 7.

 */

}
