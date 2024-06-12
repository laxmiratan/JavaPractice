package string;

public class LongestPrifix {

    public static void main(String[] args) {
        String[] s = {"geeksforgeeks", "geeks","geek","Laxmiratan"};
        System.out.println(comparing(s, s.length));
    }

    static String comparing(String[] arr, int n){
        String curString = arr[0];
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            String nextString = arr[i];
            int matchingRes = matching(curString, nextString);
            res = Math.min(matchingRes, res);
        }
        //System.out.println(res);
        if(res == 0){
            return "-1";
        }else {
            return curString.substring(0, res);
        }
    }
    static int matching(String curString, String nextString){
        int res = 0;
        int n = Math.min(curString.length(), nextString.length());

        for(int i=0; i < n; i++){
            char curCh = curString.charAt(i);
            char nextCh = nextString.charAt(i);

            if(curCh == nextCh){
                res++;
            }else
                break;
        }

        return res;
    }

}

/*
class Solution{
    String longestCommonPrefix(String arr[], int n){
        String currString = arr[0];
        String res = "";

        for(int i=0; i<n; i++){
            String nextString = arr[i];
            res = compare(currString , nextString);
            if(res.equals("")){
                return "-1";
            }
            currString = res;
        }
        return res;
    }

    String compare(String currString, String nextString){
        int i=0, j=0;
        String res = "";
        while(i < currString.length() && j < nextString.length()){
            if(currString.charAt(i) != nextString.charAt(j)){
                break;
            }
            res += currString.charAt(i);
            i++;
            j++;
        }
        return res;

    }
}
 */
