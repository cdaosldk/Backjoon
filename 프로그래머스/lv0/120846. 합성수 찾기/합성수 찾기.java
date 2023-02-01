class Solution {
public int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++) {
            int limit = (int) Math.sqrt(i);
            boolean isComposite = false;
            for (int j = 2; j <= limit; j++) {
                if (i % j == 0) {
                    isComposite = true;
                    break;
                }
            }
            if(isComposite) answer++;
        }
        return answer;
    }
}