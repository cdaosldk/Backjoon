import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> candidates = new ArrayList<>();
        int n = rank.length;

        for (int i = 0; i < n; i++) {
            if (attendance[i]) {
                candidates.add(new int[]{rank[i], i});
            }
        }

        candidates.sort(Comparator.comparingInt(arr -> arr[0]));
        
        int a = candidates.get(0)[1];
        int b = candidates.get(1)[1];
        int c = candidates.get(2)[1];

        // 5. 최종 값 계산 및 반환
        return 10000 * a + 100 * b + c;
    }
}