class Solution {
  public int solution(String myString, String pat) {
    int answer = 0;

    String lowPat = pat.toLowerCase();
    String lowerCase = myString.toLowerCase();

    if (lowerCase.contains(lowPat)) {answer = 1;}

    return answer;
  }
}