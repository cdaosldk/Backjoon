import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        int afterN = n;

        answer.add(afterN);

        while(afterN > 1) {
            if (afterN % 2 == 0) {
                afterN = afterN / 2;
            } else {
                afterN = 3 * afterN + 1;
            }

            answer.add(afterN);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}