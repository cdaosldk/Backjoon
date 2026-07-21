import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> answerMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int failMembers = 0;
            int totalMembers = 0;

            for (int stage : stages) {
                if (stage >= i) {
                    totalMembers++;
                    if (stage == i) {
                        failMembers++;
                    }
                }
            }

            if (totalMembers == 0) {
                answerMap.put(i, 0.0);
            } else {
                answerMap.put(i, (double) failMembers / totalMembers);
            }
        }

        return answerMap.entrySet().stream()
                .sorted((e1, e2) -> {
                    int compare = Double.compare(e2.getValue(), e1.getValue());
                    if (compare == 0) {
                        return Integer.compare(e1.getKey(), e2.getKey());
                    }
                    return compare;
                })
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}