package interview.java.exercises;

import java.util.ArrayDeque;

/**
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 */

public class LC125ValidPalindrome {
    public boolean isPalindromeNaive(String s) {
        // This is the naive implementation that first came to mind
        // The idea is push the string into a deque, filtering out characters as I input
        // Then I would match characters from front and back of deque
        // If all characters match AND deque is empty, return true
        // Else if any 2 front/back sets do NOT match, immediately return false
        // else if deque is not empty, return false
        ArrayDeque<Character> deque = new ArrayDeque<>();
        int lastElement = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (isValidChar(s.charAt(i))) { // in the range a-z
                deque.add(s.charAt(i));
            }
        }
        while (!deque.isEmpty()) {
            if (!(deque.getFirst().equals(deque.getLast())))
                return false;
        }

         return true;
    }

    /**
     * Checks if a characters is alphanumeric
     * @param c character
     * @return True when c is [0-9], [A-Z] or [a-z]. False otherwise
     */
    private boolean isValidChar(char c) {
        if (c <= 57 && c >= 48) // in the range 0-9
            return true;
        if (c <= 90 && c >= 65) // in the range A-Z
            return true;

        return c <= 122 && c >= 97; // in the range a-z
    }

//    public boolean isPalindrome(String s) {
//        for (int i = 0; i < s.length() / 2; i++) {
//            char front = 'c';
//            char back;
//            if (isValidChar(s.charAt(i))) {
//                front = s.charAt(i);
//            }
//        }
//    }
}
