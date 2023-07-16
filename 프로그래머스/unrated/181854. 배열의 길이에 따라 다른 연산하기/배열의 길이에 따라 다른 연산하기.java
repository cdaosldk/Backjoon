import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {

        int count = 0;
        int length = arr.length;

        if (length % 2 == 0) {
            count = 1;
        }

        int[] answer = Arrays.copyOfRange(arr, 0, length);

        int i = 0;

        while (i != length) {
            if (count == 1 && i % 2 != 0) {
                answer[i] = answer[i] + n;
            } else if (count == 0 && i % 2 == 0) {
                answer[i] = answer[i] + n;
            }
            i++;
        }

        return answer;
    }
}