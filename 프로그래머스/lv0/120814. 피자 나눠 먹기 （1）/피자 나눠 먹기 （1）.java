public class Solution {
    public int solution(int n) {
        int answer = 1;

        for(int i = 0; i < n; i++) {
            if(answer * 7/n < 1) {
                answer += 1;
            }
        }
    return answer;
    }

}