
class Solution {
    public int solution(int[] array) {
        String[] arr = new String[array.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(array[i]);

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '7') {
                    count++;
                }
            }
        }

        return count;
    }
}