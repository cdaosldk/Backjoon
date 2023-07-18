
class Solution {
    public int solution(int n) {
        int answer = 0;

        int count = 0;

        if (n % 2 == 0) {
            count = 1;
        }

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && count == 1) {
                even += i * i;
            } else if (i % 2 != 0 && count == 0) {
                odd += i;
            }
        }
        switch (count) {
            case 0 -> {
                answer = odd;
            }
            case 1 -> {
                answer = even;
            }
        }

        return answer;
    }
}