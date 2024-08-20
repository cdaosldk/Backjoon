import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
            if (set.size() == k) {
                break;
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        if (list.size() < k) {
            for (int i = list.size(); i < k; i++) {
                list.add(-1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}