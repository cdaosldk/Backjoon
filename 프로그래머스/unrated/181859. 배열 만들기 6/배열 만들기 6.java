import java.util.Stack;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack= new Stack<>();

        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if(stack.peek() == arr[i]){
                stack.pop();
                i++;
            }
        }
        if(!stack.isEmpty()) {
            return stack;
        } else {
            Stack<Integer> empty = new Stack<>();
            empty.push(-1);
            return empty;
        }
    }
}
