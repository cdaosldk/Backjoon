import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] arrTmp = Arrays.copyOf(arr, arr.length);
        int[] arrTmp2;

        int answer = 0;
        do {
            arrTmp2 = Arrays.copyOf(arrTmp, arrTmp.length);

            for (int i = 0; i < arrTmp.length; i++) {
                if (arrTmp[i] >= 50 && arrTmp[i] % 2 == 0) {
                    arrTmp[i] /= 2;
                } else if (arrTmp[i] < 50 && arrTmp[i] % 2 != 0) {
                    arrTmp[i] = arrTmp[i] * 2 + 1;
                }
            }
            answer++;

        } while (!Arrays.equals(arrTmp, arrTmp2));

        return answer - 1;
    }
}