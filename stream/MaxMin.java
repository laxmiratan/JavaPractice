package stream;

import java.util.*;

public class MaxMin {

    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
//        Integer i = list1.stream().max(Integer::compare).get();
//        Integer j = list1.stream().min(Integer::compare).get();
//        System.out.println(i);
//        System.out.println(j);

        Map<String, Integer > map = new HashMap<>() ;
        map.put ("eight", 8);
        map.put ("four", 4) ;
        map.put ("ten", 10);
        map.put("two", 2) ;

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


    }
}
