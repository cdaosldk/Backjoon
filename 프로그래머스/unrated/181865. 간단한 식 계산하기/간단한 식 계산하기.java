class Solution {
    public int solution(String binomial) {
        int answer = 0;

        String[] split = binomial.split("\\s+");

        int a = Integer.parseInt(split[0]);

        String signal = split[1];

        int b = Integer.parseInt(split[2]);

        switch (signal) {
            case "+" : answer = a + b;
                break;
            case "-" : answer = a - b;
                break;
            case  "*" : answer = a * b;
        }

        return answer;
    }
}