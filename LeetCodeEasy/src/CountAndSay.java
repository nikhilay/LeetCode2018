/**
 * Created by Nikhil on 5/1/18.
 */

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth term of the count-and-say sequence.

 Note: Each term of the sequence of integers will be represented as a string.

 Example 1:

 Input: 1
 Output: "1"
 Example 2:

 Input: 4
 Output: "1211"

 */
public class CountAndSay {
  /**
   * Complexity
   * x - avg characters in the n the sequence
   * Time - O(n * x)
   * Space - O(1)
   */
  public String countAndSay(int n) {
    String start = "1";
    if(n==1) return start;
    start = "11";
    if(n==2){
      return start;
    }
    int index=3;
    while(index<=n) {
      int count = 1;
      StringBuilder sb = new StringBuilder();
      int i;
      for (i = 0; i < start.length()-1; i++) {
        if(start.charAt(i)==start.charAt(i+1)){
          count++;
        }else{
          sb.append(count);
          sb.append(start.charAt(i));
          count=1;
        }
      }
      sb.append(count);
      sb.append(start.charAt(i));
      start = sb.toString();
      index++;
    }
    return start;
  }
}
