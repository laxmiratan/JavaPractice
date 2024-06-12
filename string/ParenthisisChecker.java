package string;

import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;

public class ParenthisisChecker {

    public static void main(String[] args) {
        String expr = "[(])";
        System.out.println(isBalance(expr));
    }

    static boolean isBalance(String x){

        // add your code here
        Stack<Character> stack = new Stack<>();
        int n = x.length();
        if(n==0 ){
            return false;
        }
        for( int i =0 ;i<n;i++){
            char ch = x.charAt(i);
            if(ch == '{'||ch == '('||ch == '['){
                stack.push(ch);

            }
            else{
                if( stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if(ch == ')' && top !='('){
                    return false;
                }
                else if(ch == '}' && top !='{'){
                    return false;
                }
                else if(ch == ']' && top !='['){
                    return false;
                }
                else{
                    stack.pop();
                }

            }

        }
        return (stack.isEmpty());
    }
}
