import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String[] strlist) {
        List<Integer> answer = new ArrayList<>();
        for (String s : strlist) {
            int cnt = 1;
            for (int j = 1; j <= s.length(); j++) {
                if (j < s.length()) {
                    cnt = cnt + 1;
                } else {
                    answer.add(cnt);
                }
            }
        }
        return answer;
    }
}