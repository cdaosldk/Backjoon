import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack= new Stack<>();

        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else {
                stack.pop();
            }
        }
        return Arrays.stream(stack.toArray(new Integer[0])).mapToInt(j -> j).toArray();
    }
}