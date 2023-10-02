class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int newSize = 1;

        while (newSize < length) {
            newSize *= 2;
        }

        int[] answer = new int[newSize];
        System.arraycopy(arr, 0, answer, 0, length);

        return answer;
    }
}