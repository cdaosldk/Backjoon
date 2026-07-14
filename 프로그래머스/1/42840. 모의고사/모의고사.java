import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        int maxScore = Arrays.stream(scores).max().getAsInt();
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answerList.add(i + 1);
            }
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}