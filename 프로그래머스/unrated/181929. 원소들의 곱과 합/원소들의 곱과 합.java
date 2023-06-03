class Solution {
  public int solution(int[] num_list) {
    int multiple = 1;
    int square = 0;

    for (int i = 0; i < num_list.length; i++) {
      square += num_list[i];
      multiple *= num_list[i];
    }
    square *= square;

    if (multiple < square) {
      return 1;
    } else return 0;
  }
}