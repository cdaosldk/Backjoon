class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {

        int count = 0;

        int j = 0;

        while (j != finished.length) {
            if (!finished[j]) {
                count++;
            }
            j++;
        }

        String[] answer = new String[count];

        int k = 0;

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer[k] = todo_list[i];
                k++;
            }
        }

        return answer;
    }
}