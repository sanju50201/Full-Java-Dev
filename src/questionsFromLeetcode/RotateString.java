/*
* Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.


Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false


Constraints:

1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.
* */

package questionsFromLeetcode;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            boolean isPossible = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt((i + j) % s.length()) != goal.charAt(j)) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
}
