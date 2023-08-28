import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] first = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] second = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        return IntStream.concat(Arrays.stream(first), Arrays.stream(second)).toArray();
    }
}