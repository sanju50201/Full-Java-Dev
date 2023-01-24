/**
 *Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */


package practice;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        // ({[]}) -- valid, when opened should be closed
        // we can use stack, in this problem as the order matters
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if (ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
