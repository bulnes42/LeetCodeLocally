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
        for (int i = 0; i < s.length(); i++) {
            if (isValidChar(s.charAt(i))) { // in the range a-z
                deque.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        while (deque.size() > 1) { // size = 1 means there is a single unmatched element in the middle of palindrome
            // e.g. xyx is a palindrome even if the y is unmatched
            if (!(deque.removeFirst().equals(deque.removeLast())))
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

    public boolean isPalindrome(String s) {
        // Create temp variables to store first and last char
        char front;
        char back;
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            // cast entire string toUpper
            // Idea: Let i = start of string and j = end of string
            // Check if the char at i is valid
            // Else increment i and check again
            // Check if the chart at j is valid
            // Else decrement j and check again

            // Once we know i and j are valid, check if they are the same character
            // if they are the same, decrement i and j and restart loop
            // if they are not the same return false
            // run loop until i = j
            // return true



            // Check if first char is valid and advance to next char otherwise
            while ( i < s.length() && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // Check if last char is valid and advance to previous char otherwise
            while( j > 0 && !Character.isLetterOrDigit(s.charAt(j) ) ) {
                j--;
            }
            // store the valid chars in my temp variables
            // This is so that I do not manipulate the original array at all when I cast toLowerCase
            front = Character.toLowerCase(s.charAt(i));
            back = Character.toLowerCase(s.charAt(j));
            // Look for a mismatch between front and back
            if (front != back) {
                return false;
            }
        }
        return true;
    }
}
