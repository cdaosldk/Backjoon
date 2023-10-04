import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        int length = 0;

        while (i < arr.length) {
            if (arr[i] == 2) {
                length = 1;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == 2) {
                        length = j + 1;
                    }
                }
                break;
            }
            i++;
        }

        int count = 0;
        for (int k : arr) {
            if (k == 2) {
                count = 1;
                break;
            } else count = 0;
        }

        if (count == 1) {
            return Arrays.copyOfRange(arr, i, length);
        } else {
            return new int[] {-1};
        }
    }
}