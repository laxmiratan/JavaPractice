package stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,5,6,7);
        List<Integer> n1 = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .toList();
        System.out.println(n1);
    }
}
