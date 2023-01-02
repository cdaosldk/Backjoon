class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int array = num_list.length;
        for(int i = 0; i < array; i++) {
            answer[i] = num_list[array -1 -i];
        }
        return answer;
    }
}