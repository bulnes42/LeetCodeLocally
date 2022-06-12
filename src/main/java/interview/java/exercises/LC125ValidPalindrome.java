package interview.java.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 */

public class LC125ValidPalindrome {
    public boolean isPalindromeNaive(String s) {
        // This is the naive implementation that first came to mind
        // The idea is push the string into a deque, filtering out characters as I input
        // Then I would match characters from front and back of deque
        // If all characters match AND deque is empty, return true
        // Else if any 2 front/back sets do NOT match, immedieately return false
        // else if deque is not empty, return false
        ArrayDeque<Character> deque = new ArrayDeque<>();
        int lastElement = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) <= 57 && s.charAt(i) >= 48) // in the range 0-9
                    || (s.charAt(i) <= 90 && s.charAt(i) >= 65) // in the range A-Z
                    || (s.charAt(i) <= 122 && s.charAt(i) >= 97)) { // in the range a-z

            }
        }


         return false;
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            char front = 'c';
            char back;
            if ((s.charAt(i) <= 57 && s.charAt(i) >= 48) || (s.charAt(i) <= 90 && s.charAt(i) >= 65) ||
                    (s.charAt(i) <= 122 && s.charAt(i) >= 97)) {
                front = s.charAt(i);
            }
        }
    }
}
