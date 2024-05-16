class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];

        for (int i=0; array.length > i; i++) {
            int temp = array[ i ];
            int gap = Math.abs( answer - n );
            int curr = Math.abs( temp - n );

            if (curr < gap || (gap == curr && answer > temp)) {
                answer = temp;
            }
        }
        return answer;
    }
}