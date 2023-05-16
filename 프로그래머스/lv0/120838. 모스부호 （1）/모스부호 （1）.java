import java.util.HashMap;
import java.util.Map;

class Solution {

  public String solution(String letter) {
    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--.."};
    char alphabet = 'a';
    Map<String, String> morseLetter = new HashMap<>();
    for (String s : morse) {
      morseLetter.put(s, String.valueOf(alphabet));
      alphabet++;
    }
    String[] s = letter.split(" ");
    StringBuilder answer = new StringBuilder();
    for (String value : s) {
      answer.append(morseLetter.get(value));
    }
    return answer.toString();
  }
}