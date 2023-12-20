class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            char[] arrayForCopy = new char[queries[i][1] - start + 1];

            for (int j = 0; j < arrayForCopy.length; j++) {
                arrayForCopy[j] = sb.charAt(start);
                start++;
            }

            start = queries[i][0];
            for (int j = arrayForCopy.length - 1; j >= 0 ; j--) {
                sb.setCharAt(start, arrayForCopy[j]);
                start++;
            }
        }

        return sb.toString();
    }
}