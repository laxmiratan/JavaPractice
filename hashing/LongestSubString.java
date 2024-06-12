package hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println(longestSubString(s));
    }
    static int longestSubString(String s){

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            set.add(c);
        }

        return set.size();
    }
}
