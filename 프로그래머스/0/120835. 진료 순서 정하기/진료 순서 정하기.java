import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int[] array = Arrays.stream(emergency).boxed().sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (emergency[i] == array[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}