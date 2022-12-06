import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i= 0; i <= n; i++) {
            if(i % 2 == 1) {
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(Integer :: intValue).toArray();
        return answer;
    }
}