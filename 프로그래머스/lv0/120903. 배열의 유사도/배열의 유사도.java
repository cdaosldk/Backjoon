class Solution {
    public int solution(String[] s1, String[] s2) {

        int array = s2.length;

        int array2 = s1.length;

        int answer = 0;

        for(int i = 0; i < array; i++) {
            for(int j = 0; j < array2; j++) {
                if(s1[j].equals(s2[i])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}