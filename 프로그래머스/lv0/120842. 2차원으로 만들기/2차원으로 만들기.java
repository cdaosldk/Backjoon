class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] list = new int[num_list.length / n][n];
        
        for (int i = 0; i < num_list.length / n; i++) {
            int[] arr = new int[n];
            
            for(int j = 0; j < n; j++) {
                arr[j] = num_list[i * n + j];
            }
        list[i] = arr;
        }
        return list;
    }
}