class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        int count = 0;

        for (int i = 0; i < queries.length; i++) {
            int tmp = 1000001;
            count = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && tmp >= arr[j]) {
                    tmp = arr[j];
                    count++;
                } else if (j == queries[i][1] && count == 0) {
                    tmp = -1;
                }
            }
            answer[i] = tmp;
        }

        return answer;
    }
}