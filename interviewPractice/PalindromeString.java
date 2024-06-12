package interviewPractice;

public class PalindromeString {
    static boolean isPalindrome(String str, int n){
        char start = str.charAt(0);
        char end = str.charAt(n-1);
        for(int i = 1 ; i <= n/2; i++){
            if(start != end){
                return false;
            }else {
                start = str.charAt(i);
                end = str.charAt(n-1-i);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcba";
        int n = str.length();
        System.out.println(isPalindrome(str, n));
    }
}
