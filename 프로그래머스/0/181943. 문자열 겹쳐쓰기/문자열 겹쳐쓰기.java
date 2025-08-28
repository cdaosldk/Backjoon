class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String dontOverwrite = my_string.substring(s + overwrite_string.length());
        String substring = my_string.substring(0, s);

        return substring + overwrite_string + dontOverwrite;
    }
}