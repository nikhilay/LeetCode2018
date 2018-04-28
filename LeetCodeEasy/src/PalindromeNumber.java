/**
 * Created by Nikhil on 4/28/18.
 */

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

 Example 1:

 Input: 121
 Output: true
 Example 2:

 Input: -121
 Output: false
 Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 Example 3:

 Input: 10
 Output: false
 Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 Follow up:

 Coud you solve it without converting the integer to a string?
 */


public class PalindromeNumber {

  /**
   * --- Hints ---
   * Just checking half of the digits is sufficent
   *
   * --- Complexity ---
   * Time - O(No of digits) or O(Log base 10(number))
   * both are same
   * example:- 121 - 3 digits or log base 10 (121) = 2.something
   *
   * Solution:-
   * https://leetcode.com/problems/palindrome-number/solution/
   */
  public boolean isPalindrome(int x) {
    if (x < 0 || ((x%10)==0 && x!=0)) return false;
    int rev = 0;
    while (x > rev) {
      rev = rev * 10 + x % 10;
      x = x / 10;
    }
    return x==rev || (x==rev/10);

  }
}
