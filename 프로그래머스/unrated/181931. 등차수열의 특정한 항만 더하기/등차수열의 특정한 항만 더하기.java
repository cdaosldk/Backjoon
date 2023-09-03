class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        int c = 0;

        for (int i = 0; i < included.length; i++) {
            if (i != 0) {
                c += d;
            } else c = a;

            if (included[i]) {
                answer += c;
            }
        }

        return answer;
    }
}