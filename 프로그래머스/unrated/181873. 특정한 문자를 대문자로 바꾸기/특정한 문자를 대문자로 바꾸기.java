class Solution {
  public String solution(String my_string, String alp) {

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < my_string.length(); i++) {
      if(my_string.charAt(i) == alp.charAt(0)) {
        sb.append(Character.toUpperCase(my_string.charAt(i)));
      } else sb.append(my_string.charAt(i));
    }
    return sb.toString();
  }
}
