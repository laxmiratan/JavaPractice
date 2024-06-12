package hashing;

import java.util.HashSet;

public class HashsetDemo {

    public static void main(String[] args) {

        HashSet<String> h = new HashSet<>();
        h.add("laxmi");
        h.add("courses");
        h.add("ide");

        System.out.println(h);
        System.out.println(h.contains("laxmi"));

        for (String s : h) System.out.println(s + " ");

    }

}
