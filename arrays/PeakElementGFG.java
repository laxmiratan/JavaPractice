package arrays;

public class PeakElementGFG {

    public int peakElementUtil(int[] arr,int l,int r,int n)
    {
        int mid = l+(r-l)/2;

        if( (mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid]) )
            return mid;

        if(mid > 0 && arr[mid-1]>arr[mid])
            return peakElementUtil(arr,l,mid-1,n);

        else
            return peakElementUtil(arr,mid+1,r,n);
    }
    public void peakElement(int[] arr, int n)
    {
        peakElementUtil(arr, 0, n - 1, n);
    }

    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1, 1, 1, 2, 1, 1, 1};
        PeakElementGFG pe = new PeakElementGFG();
        pe.peakElement(arr, n);
    }

}
