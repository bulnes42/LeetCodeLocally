package interview.java.exercises;

/**
 * @see: <a-href="https://leetcode.com/problems/valid-parentheses/">valid Parentheses</a>
 */

import java.util.Objects;
import java.util.Stack;

public class LC20ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>(); // Store parens in stack
        for (int i = 0; i < s.length(); i++) { // iterate through string one char at a time
           switch (s.charAt(i)) {
               case ')': {

                   if (stack.empty()) return false; // Cannot be valid if closing parens first symbol
                   if (Objects.equals(stack.peek(), '(')) { // Matching parentheses, remove from stack
                       stack.pop();
                   }
                   break;
               }
               case ']':
                   if (stack.empty()) return false; // cannot be valid if closing bracket is first symbol
                   if (Objects.equals(stack.peek(), '[')) // Matching bracket remove from stack
                       stack.pop();
                   break;
               case '}':
                   if (stack.empty()) return false; // cannot be valid if closing brace is first symbol
                   if (Objects.equals(stack.peek(), '{')) // matching brace, remove from stack
                       stack.pop();
                   break;
               default:
                   stack.push(s.charAt(i)); // No match found, store in stack and go to next iteration
           }

        }
        return stack.empty(); // Stack is empty if all symbols are matching and have been removed

    }
}
