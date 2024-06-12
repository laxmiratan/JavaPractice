package interviewPractice;

import java.util.Iterator;
import java.util.Map;

public class NonMatchingCharacter {

    public static Map<Character, Integer> nonMatching(String str){
        Map<Character, Integer> map = OccurrenceString.occer(str);
        //map.entrySet().removeIf(e -> e.getValue() > 1);
        for(Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry<Character,Integer> e = it.next();
            if(e.getValue() > 1)
                it.remove();
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "laxmiratan";
        System.out.println(nonMatching(s));
    }
}
