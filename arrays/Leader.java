package arrays;

import java.util.ArrayList;

public class Leader {

    public static void leader(int[] arr, int n){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2; i > 0; i--){
            if(arr[i-1] < arr[i] && arr[i] > max){
                al.add(arr[i]);
            }

            if( i == 1 && arr[i] < arr[i-1] && arr[i-1] > max){
                al.add(arr[i-1]);
            }
        }
        System.out.println(al.toString());
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        leader(arr, n);
    }

    /*
        Input: arr[] = {16, 17, 4, 3, 5, 2},
        Output: 17, 5, 2

        Input: arr[] = {1, 2, 3, 4, 5, 2},
        Output: 5, 2
    */
}
