class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < Math.min(str1.length(), str2.length())) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));

            i++;
        }

        return sb.toString();
    }
}