/**
 * Created by Nikhil on 4/28/18.
 */

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
 * range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 */

public class ReverseInteger {
  public int reverse(int x) {
    long result = 0;
    while (x != 0) {
      result = (x % 10) + result * 10;
      x = x / 10;
      if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
        return 0;
      }

    }
    return (int) result;
  }
}

