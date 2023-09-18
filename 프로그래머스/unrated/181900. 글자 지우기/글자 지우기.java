import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] array = my_string.split("");

        Arrays.sort(indices);

        for (int i = 0; i < my_string.length(); i++) {
            if (isBinarySearch(indices, i)) {
                array[i] = "";
            }
        }

        return String.join("", array);
    }

    public boolean isBinarySearch(int[] indices, int i) {
        int result = Arrays.binarySearch(indices, i);
        return result >= 0;
    }
}