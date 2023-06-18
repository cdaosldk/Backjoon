import java.util.ArrayList;

class Solution {
  public int[] solution(int n, int k) {
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = k; i <= n; i++) {
      if (i % k == 0) {
        arrayList.add(i);
      }
    }

    int[] answer = new int[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      answer[i] = arrayList.get(i);
    }

    return answer;
  }
}