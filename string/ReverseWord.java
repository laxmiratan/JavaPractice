package string;

public class ReverseWord {

    public static void main(String[] args) {
        String s = "Laxmiratan";
        System.out.println(reverse(s));
        reverseBuffer(s);
    }

    static String reverse(String s){
        String temp= "";
        char ch;

        for(int i = 0; i< s.length(); i++){
            ch = s.charAt(i);
            temp = ch+temp;
        }
        return temp;
    }

    static void reverseBuffer(String s){
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }

}
