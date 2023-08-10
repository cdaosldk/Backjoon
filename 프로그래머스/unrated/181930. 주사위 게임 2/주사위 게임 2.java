class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        int sum = a + b + c;

        int douBle = (int)Math.round(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));

        int triple = (int)Math.round(Math.pow(a,3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a != b || a != c) {
            if (b != c) {
                answer = sum;
            } else answer = sum * douBle;
        }

        if (a == b || a == c) {
            if (b != c) {
                answer = sum * douBle;
            } else answer = sum * douBle * triple;
        }

        return answer;
    }
}