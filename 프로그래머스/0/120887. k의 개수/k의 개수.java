class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
            String[] split = Integer.toString(l).split("");
            for (int m = 0; m < split.length; m++) {
                if (Integer.toString(k).equals(split[m])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}