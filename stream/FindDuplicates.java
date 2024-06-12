package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(8,10,15,98,8,49,25,10,98,32);
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(x -> !set.add(x))
                .forEach(System.out::println);

    }
}
