import java.util.HashSet;
import java.util.LinkedHashSet;

class Solution {
  public String solution(String my_string) {
    HashSet<String> s = new LinkedHashSet<>();

    for (int i = 0; i < my_string.length(); i++) {
      s.add(String.valueOf(my_string.charAt(i)));
    }
    return String.join("", s);
  }
}