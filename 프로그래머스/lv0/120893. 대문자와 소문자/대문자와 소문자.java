class Solution {
    public String solution(String my_string) {

        String answer;

        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < my_string.length(); i++) {
            answer =
                    (my_string.substring(i , i+1).matches("^[a-z]$")) ?
                            my_string.substring(i , i+1).toUpperCase() :
                            my_string.substring(i , i+1).toLowerCase();
            stringBuffer.append(answer);
        }
        return stringBuffer.toString();
    }
}