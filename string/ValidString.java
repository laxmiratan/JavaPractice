package string;

public class ValidString {
    public static void main(String[] args) {
        String s = "Laxmiratan";
        System.out.println(isValid(s));
    }

    static Boolean isValid(String s){
        String regex = "^[a-zA-Z]+$";
        return s.matches(regex);
    }
}
