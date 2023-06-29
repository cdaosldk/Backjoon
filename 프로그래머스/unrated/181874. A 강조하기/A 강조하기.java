class Solution {
  public String solution(String myString) {

    StringBuilder sb = new StringBuilder();

    String lowerCase = myString.toLowerCase();

    for (int i = 0; i < lowerCase.length(); i++) {
      if(lowerCase.charAt(i) == 'a') {
        sb.append(Character.toUpperCase(lowerCase.charAt(i)));
      } else sb.append(lowerCase.charAt(i));
    }
    return sb.toString();
  }
}