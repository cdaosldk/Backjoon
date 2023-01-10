import static java.util.regex.Pattern.matches;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String regex = "^[0-9]";
        for(int i = 0; i < my_string.length(); i++) {
            if(matches(regex,my_string.substring(i, i+1))) {
                answer += Integer.parseInt(my_string.substring(i, i+1));
            }
        }
        return answer;
    }
}