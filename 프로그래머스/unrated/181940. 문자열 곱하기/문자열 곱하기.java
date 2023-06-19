class Solution {
  public String solution(String my_string, int k) {
    StringBuilder answer = new StringBuilder();
    answer.append(String.valueOf(my_string).repeat(Math.max(0, k)));
    return answer.toString();
  }
}