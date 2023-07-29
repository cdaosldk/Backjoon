import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] beforeN = Arrays.copyOfRange(num_list, 0, n);

        int[] afterN = Arrays.copyOfRange(num_list, n, num_list.length);

        for (int i : afterN) {
            answer.add(i);
        }

        for (int i : beforeN) {
            answer.add(i);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}