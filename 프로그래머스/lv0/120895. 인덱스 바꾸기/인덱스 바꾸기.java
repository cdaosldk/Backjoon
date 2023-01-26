class Solution {
    public String solution(String my_string, int num1, int num2) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(my_string);

        stringBuilder.setCharAt(num1, my_string.charAt(num2));
        stringBuilder.setCharAt(num2, my_string.charAt(num1));

        return stringBuilder.toString();
    }
}