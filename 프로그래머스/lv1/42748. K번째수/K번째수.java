
import java.util.Arrays;

class Solution {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    int[] array1;

    for (int i = 0; i < commands.length; i++) {
      array1 = Arrays.stream(array, commands[i][0] - 1, commands[i][1])
          .sorted()
          .toArray();

        answer[i] = array1[commands[i][2] - 1];
    }
    return answer;
  }
}
