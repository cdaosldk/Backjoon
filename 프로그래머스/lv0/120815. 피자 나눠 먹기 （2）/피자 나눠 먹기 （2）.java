public class Solution {
    public int solution(int n) {
        int answer = 1;

        for(int i = 0; i <= n; i++) {
            if(answer * 6%n != 0) {
                answer += 1;
            }
        }
    return answer;
    }

}