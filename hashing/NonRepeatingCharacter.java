package hashing;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        Map<Character, Integer> map = new HashMap<>();
        for(char i : S.toCharArray()){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(char i : S.toCharArray()){
            if(map.containsKey(i) && map.get(i) == 1){
                return i;
            }
        }

        return '$';
    }
}
