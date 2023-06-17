class Solution {
  public int solution(int[] numbers, int n) {
    int answer = 0;
    int temp = 0;

    for (int i = 0; i < numbers.length; i++) {
      temp += numbers[i];
      if(temp > n) {
        answer = temp;
        break;
      }
    }

    return answer;
  }
}