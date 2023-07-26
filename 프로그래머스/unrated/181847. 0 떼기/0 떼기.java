class Solution {
    public String solution(String n_str) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i != n_str.length()) {
            if (n_str.charAt(i) != '0') {
                break;
            }
            i++;
        }

        for (int j = i; j < n_str.length(); j++) {
            sb.append(n_str.charAt(j));
        }

        return sb.toString();
    }
}