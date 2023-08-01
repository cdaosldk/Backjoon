class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = String.valueOf(a);

        String strB = String.valueOf(b);

        answer = Math.max(2 * a * b, Integer.parseInt(strA + strB));

        return answer;
    }
}