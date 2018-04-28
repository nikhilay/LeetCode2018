/**
 * Created by Nikhil on 4/28/18.
 */

import java.util.HashMap;

/**
 * Example 1:

 Input: "III"
 Output: 3
 Example 2:

 Input: "IV"
 Output: 4
 Example 3:

 Input: "IX"
 Output: 9
 Example 4:

 Input: "LVIII"
 Output: 58
 Explanation: C = 100, L = 50, XXX = 30 and III = 3.
 Example 5:

 Input: "MCMXCIV"
 Output: 1994
 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

/**
 * Inspired from
 * https://leetcode.com/problems/roman-to-integer/discuss/6509/7ms-solution-in-Java.-easy-to-understand
 *
 * Time Complexity
 * O(number of character in the string)
 * Space Complexity
 * O(1)
 */
public class RomanToInteger {
  public int romanToInt(String s) {
    if(s==null || s.length()==0) return -1;
    HashMap<Character, Integer> hmap = new HashMap<>();
    hmap.put('I',1);
    hmap.put('V',5);
    hmap.put('X',10);
    hmap.put('L',50);
    hmap.put('C',100);
    hmap.put('D',500);
    hmap.put('M',1000);
    int result = 0;
    int i =0;
    for(i=0;i<s.length()-1;i++){
      if(hmap.get(s.charAt(i))< hmap.get(s.charAt(i+1))){
        result -= hmap.get(s.charAt(i));
      }else{
        result += hmap.get(s.charAt(i));
      }
    }
    return result + hmap.get(s.charAt(i));
  }
}
