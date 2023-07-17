class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        int a = 0;
        int b = 0;

        if (arr1.length == arr2.length) {
            for (int i : arr1) {
                a += i;
            }

            for (int j : arr2) {
                b += j;
            }
        }
        
        if (arr1.length > arr2.length || a > b) {
            answer = 1;
        } else if (arr1.length < arr2.length || a < b) {
            answer = -1;
        }

        return answer;
    }
}