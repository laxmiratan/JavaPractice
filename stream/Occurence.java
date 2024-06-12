package stream;

import java.util.Arrays;

public class Occurence {
    public static void main(String[] args) {
        String[] s = {"aa", "bb", "aa", "ac", "aa"};

        int aa = (int) Arrays.stream(s).filter(x -> x.equals("aa")).count();
        System.out.println(aa);
    }
}
