class Solution {
    public int solution(int[] num_list) {

        int i = 0;

        int sumOdd = 0;

        int sumEven = 0;

        while (i != num_list.length) {
            if (i % 2 == 0) {
                sumEven += num_list[i];
            } else sumOdd += num_list[i];

            i++;
        }

        return Math.max(sumEven, sumOdd);
    }
}