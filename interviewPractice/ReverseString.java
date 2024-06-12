package interviewPractice;

public class ReverseString {
    public static String reverse(String str){
        String rev = "";
        char c;
        for(int i = 0; i < str.length();i++){
            c = str.charAt(i);
            rev = c+ rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "Laxmi";
        System.out.println(reverse(s));
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }
}
