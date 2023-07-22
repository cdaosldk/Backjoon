import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        int i = 0;

        ArrayList<Integer> answer = new ArrayList<>();

        while(arr.length != i){
            for (int k : delete_list) {
                if (arr[i] == k) {
                    arr[i] = 0;
                    break;
                }
            }
            if (arr[i] != 0) {
                answer.add(arr[i]);
            }
            i++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}