package Interview;

import java.util.HashSet;
import java.util.Set;

public class Longestsubstring {
    public static void main(String[] args) {
       String str = "khushbu";
       int left = 0;
       int maxlength = 0;
       int startIndex =0;
      Set<Character> set = new HashSet<>();
      for(int right =0; right<str.length(); right++) {

          while (set.contains(str.charAt(right))) {
              set.remove(str.charAt(left));
              left++;
          }
          set.add(str.charAt(right));

          if (right - left + 1 > maxlength) {
              maxlength = right - left + 1;
              startIndex = left;
          }

      }
        System.out.println("Longest substring: " + str.substring (startIndex,startIndex+maxlength));
      System.out.println("maxlength:" + maxlength);
    }
}
