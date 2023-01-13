class Solution {
    public String solution(String cipher, int code) {

        StringBuilder stringBuilder = new StringBuilder();

        int array = cipher.length();

        for(int i = (code-1); i < array; i += code) {
            stringBuilder.append(cipher.charAt(i));
        }

        return stringBuilder.toString();
    }
}