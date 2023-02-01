class Solution {
public int solution(int n) {
        int answer = 0;
        int cnt = 2;

        for(int i = 2; i <= n; i++) {
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt >= 3) {
                answer++;
            }
            cnt = 2;
        }
        return answer;
    }
}