class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int len = dot.length;
        if(dot[0] > 0  && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] > 0  && dot[1] < 0) {
            answer = 4;
        } else if (dot[0] < 0  && dot[1] < 0) {
            answer = 3;
        } else answer = 2;

        return answer;
    }
}