class Solution {
    public String solution(int[] numLog) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            int beforeW = numLog[i - 1] + 1;
            int beforeS = numLog[i - 1] - 1;
            int beforeD = numLog[i - 1] + 10;
            int beforeA = numLog[i - 1] - 10;

            if (numLog[i] == beforeW) {
                sb.append("w");
            } else if (numLog[i] == beforeS) {
                sb.append("s");
            } else if (numLog[i] == beforeD) {
                sb.append("d");
            } else if (numLog[i] == beforeA) {
                sb.append("a");
            }
        }

        return sb.toString();
    }
}