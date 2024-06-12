package string;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {
        String s = "I.am.Laxmiratan";
        reverse(s);
    }

    static void reverse(String s){
        String[] sa = s.split("[.]");
        String temp = "";
        for(int i = 0; i < sa.length; i++){
            temp = sa[i]+"."+temp;
        }
        System.out.println(temp);
    }

}
