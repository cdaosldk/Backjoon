class Solution {
    public String solution(String cipher, int code) {

        StringBuilder stringBuffer = new StringBuilder();

        int array = cipher.length();

        for(int i = (code-1); i < array; i += code) {
            stringBuffer.append(cipher.charAt(i));
        }

        return stringBuffer.toString();
    }
}