package stream;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        Arrays.stream(new String[]{"Ram", "Laxmi", "Sudha","Shreemaa"})
                .filter(s -> s.startsWith("S"))
                .map(String :: toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }
}
