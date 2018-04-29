import java.util.Stack;

/**
 * Created by Nikhil on 4/28/18.
 */

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Note that an empty string is also considered valid.

 Example 1:

 Input: "()"
 Output: true
 Example 2:

 Input: "()[]{}"
 Output: true
 Example 3:

 Input: "(]"
 Output: false
 Example 4:

 Input: "([)]"
 Output: false
 Example 5:

 Input: "{[]}"
 Output: true
 */
public class ValidParentheses {
  /**
   * Complexity
   * Time - O(String length)
   * Space - O(String length) worst case - s ="((((((((("
   * Inspired from
   * https://leetcode.com/problems/valid-parentheses/discuss/9248/My-easy-to-understand-Java-Solution-with-one-stack
   */
  public boolean isValid(String s) {
    if(s.length()==0) return true;
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i<s.length(); i++){
      char c = s.charAt(i);
      if(c=='(' || c=='{' || c=='[' ){
        stack.push(c);
      }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
        stack.pop();
      }else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
        stack.pop();
      }else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
        stack.pop();
      } else {
        return false;
      }
    }

   return stack.isEmpty();
  }
}
