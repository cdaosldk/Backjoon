class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int tmpForI = 0;
        int tmpForJ = 0;

        for (int i = 0; i < queries.length; i++) {
            tmpForI = arr[queries[i][0]];
            tmpForJ = arr[queries[i][1]];

            arr[queries[i][1]] = tmpForI;
            arr[queries[i][0]] = tmpForJ;
        }
        
        return arr;
    }
}