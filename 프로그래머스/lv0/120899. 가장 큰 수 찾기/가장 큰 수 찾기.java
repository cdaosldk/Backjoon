class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = 0;
        int index = 0;
        int length = array.length;

        for(int i = 0; i < length; i++) {
            if(i == 0) {
                max = array[0];
            } else if (array[i-1] < array[i]) {
                max = array[i];
                index = i;
            } else {
                max = array[i-1];
                index = i-1;
            }
        }

        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}