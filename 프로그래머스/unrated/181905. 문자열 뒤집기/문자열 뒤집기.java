class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < s) {
            sb.append(my_string.charAt(i));
            i++;
        }

        for (int j = e; j >= s; j--) {
            sb.append(my_string.charAt(j));
        }

        if (my_string.length() > e) {
            for (int j = e + 1; j < my_string.length(); j++) {
                sb.append(my_string.charAt(j));
            }
        }

        return sb.toString();
    }
}