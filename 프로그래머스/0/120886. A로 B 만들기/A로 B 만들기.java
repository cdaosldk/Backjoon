import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        String beforeForCompare = before.chars().sorted().mapToObj(b -> String.valueOf((char) b)).collect(Collectors.joining());

        String afterForCompare = after.chars().sorted().mapToObj(b -> String.valueOf((char) b)).collect(Collectors.joining());

        if (beforeForCompare.equals(afterForCompare)) {
            answer = 1;
        }
        return answer;
    }
}