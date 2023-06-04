class Solution {
  public int solution(int[] num_list) {
    StringBuilder stringOdd = new StringBuilder();
    StringBuilder stringEven = new StringBuilder();

    for (int j : num_list) {
      if (j % 2 != 0) {
        stringOdd.append(j);
      } else stringEven.append(j);
    }
    return Integer.parseInt(stringEven.toString()) + Integer.parseInt(stringOdd.toString());
  }
}