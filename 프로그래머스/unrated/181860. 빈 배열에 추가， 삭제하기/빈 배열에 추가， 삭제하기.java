import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                int i1 = arr[i] * 2;
                for (int j = 0; j < i1; j++) {
                    arrayList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}