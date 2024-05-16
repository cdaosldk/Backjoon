import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        return Pattern.compile("\\D").splitAsStream(my_string).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
}