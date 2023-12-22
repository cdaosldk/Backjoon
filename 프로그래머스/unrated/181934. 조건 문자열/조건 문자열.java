class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        switch (ineq) {
            case "<" :
                answer = getAnswer(eq, n <= m, n > m); break;
            case ">" :
                answer = getAnswer(eq, n >= m, n < m); break;
        }
        return answer;
    }

    private int getAnswer(String eq, boolean c1, boolean c2) {
        return switch (eq) {
            case "=" -> c1 ? 1 : 0;
            case "!" -> c2 ? 0 : 1;
            default -> 0;
        };
    }
}