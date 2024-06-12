package string;

import java.util.Stack;

public class PalindrumCheck {
    public static void main(String[] args) {
        String s = "abccdba";
        System.out.println(isPalidrum(s));
    }
    static boolean isPalidrum(String S){
        boolean flag = false;
        for(int i = 0; i <= S.length()/2; i++){
            char low = S.charAt(i);
            char high = S.charAt(S.length()-1-i);
            if(low == high){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
