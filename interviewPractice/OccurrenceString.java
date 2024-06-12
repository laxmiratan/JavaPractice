package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceString {

    public static Map<Character, Integer> occer(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return map;
    }

    public static void main(String[] args) {

        String s = "Laxmiratan";
        //occer(s);
    }

}
