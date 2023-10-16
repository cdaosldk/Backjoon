import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] arrTmp = Arrays.copyOf(arr, arr.length);
        int[] arrTmp2;

        int answer = 0;
        while (true) {
            arrTmp2 = Arrays.copyOf(arrTmp, arrTmp.length); // 현재 배열 복사

            for (int i = 0; i < arrTmp.length; i++) {
                if (arrTmp[i] >= 50 && arrTmp[i] % 2 == 0) {
                    arrTmp[i] /= 2;
                } else if (arrTmp[i] < 50 && arrTmp[i] % 2 != 0) {
                    arrTmp[i] = arrTmp[i] * 2 + 1;
                }
            }
            answer++;

            if (Arrays.equals(arrTmp, arrTmp2)) {
                break;
            }
        }

        return answer - 1;
    }
}