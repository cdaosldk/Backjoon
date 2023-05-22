class Solution {
  public String solution(String my_string, int[] index_list) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < index_list.length; i++) {
      stringBuilder.append(my_string.charAt(index_list[i]));
    }
    return stringBuilder.toString();
  }
}