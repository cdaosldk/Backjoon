class Solution {
    public String solution(String my_string, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        int array = my_string.length();

        for(int i = 0; i < array; i++) {
            for(int j = 0; j < n; j++) {
                stringBuffer.append(my_string.charAt(i));
            }
        }
        String answer = stringBuffer.substring(0);
        return answer;
    }
}