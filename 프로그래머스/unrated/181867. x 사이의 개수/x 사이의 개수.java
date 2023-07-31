class Solution {
    public int[] solution(String myString) {
        String[] xes = myString.split("x", -1);

        int[] answer = new int[xes.length];

        for (int i = 0; i < xes.length; i++) {
            answer[i] = xes[i].length();
        }

        return answer;
    }
}