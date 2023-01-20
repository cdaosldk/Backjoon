class Solution {
    public String solution(int age) {

        String string = String.valueOf(age);

        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < string.length(); i++) {
            answer.append((char) (string.charAt(i) + 49));
        }

        return answer.toString();
    }
}