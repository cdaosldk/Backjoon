import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int array = numbers.length;
        int result = 0;
        int answer = 0;
        for(int i = 0; i < (array - 1); i++) {
            result = numbers[i] * numbers[i + 1];
            if(result > answer) {
                answer = result;
            } else {

            }
        }
        return answer;
    }
}