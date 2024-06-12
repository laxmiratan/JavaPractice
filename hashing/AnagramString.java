package hashing;

import interviewPractice.OccurrenceString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AnagramString {

    public static boolean anagram(String a, String b){
        boolean flag = true;

        if(a.length() != b.length())
            flag = false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< a.length();i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
        }

        for(int i = 0; i < b.length(); i++){
            if(map.containsKey(b.charAt(i)))
                map.put(b.charAt(i), map.get(b.charAt(i))-1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()!= 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String str1 = "listen" , str2 = "silent";
        String a = "abc", b = "adc";
        System.out.println(anagram(str1, str2));
        System.out.println(anagram(a,b));
    }

}
