class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < arr.length; i++) {
            for (int[] query : queries) {
                if (query[0] <= i && i <= query[1]) {
                    if (i % query[2] == 0) {
                        arr[i] += 1;
                    }
                }

            }
        }

        return arr;
    }
}