import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        IntStream sorted = Arrays.stream(num_list).sorted();

        return Arrays.copyOfRange(sorted.toArray(), 0 ,5);
    }
}