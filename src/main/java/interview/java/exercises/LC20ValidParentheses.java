package interview.java.exercises;


import java.util.Objects;
import java.util.Stack;

public class LC20ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Objects.equals(s.charAt(i), ')')) {
                if (!(Objects.equals(stack.peek(), '('))) {
                    return false; // False when close parenthesis not preceded by open parenthesis
                }
            }
            if (Objects.equals(s.charAt(i), ']')) {
                if (!(Objects.equals(stack.peek(), '['))) {
                    return false; // False when close bracket not preceded by open bracket
                }
            }
            if (Objects.equals(s.charAt(i), '}')) {
                if (!(Objects.equals(stack.peek(), '{'))) {
                    return false; // False when close braces not preceded by open brace
                }
            }
            stack.push(s.charAt(i));
        }
        return true;
    }
}
