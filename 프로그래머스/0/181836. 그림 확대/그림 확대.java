class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        int index = 0;
        for (String s : picture) {
            StringBuilder builder = new StringBuilder();
            for (char ch : s.toCharArray()) {
                builder.append(String.valueOf(ch).repeat(k));
            }
            String expandedRow = builder.toString();

            for (int i = 0; i < k; i++) {
                answer[index++] = expandedRow;
            }
        }
        return answer;
    }
}