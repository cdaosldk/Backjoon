class Solution {
    public int solution(String number) {
        int length = number.length();

        int sumOfDigits = 0;

        for (int i = 0; i < length; i++) {
            sumOfDigits += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return sumOfDigits % 9;
    }
}