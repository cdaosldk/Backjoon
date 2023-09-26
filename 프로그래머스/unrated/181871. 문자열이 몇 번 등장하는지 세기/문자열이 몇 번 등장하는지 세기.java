class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int length = 0;

        for (int i = 0; i < myString.length(); i++) {
            length = i + pat.length();
            if (length > myString.length()) {
                length = myString.length();
            }
            String subString = myString.substring(i, length);
            if (pat.equals(subString)) {
                answer++;
            }
        }

        return answer;
    }
}