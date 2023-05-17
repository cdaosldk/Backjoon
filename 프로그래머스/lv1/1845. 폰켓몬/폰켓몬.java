import java.util.Hashtable;

class Solution {
  public int solution(int[] nums) {
    Hashtable hashtable = new Hashtable<>();

    for (int i = 0; i < nums.length; i++) {
      if(!hashtable.containsKey(nums[i])) {
        hashtable.put(nums[i], i + " 번 폰켓몬");
      }
    }
    if(hashtable.size() <= nums.length/2) {
      return hashtable.size();
    } else {
      return nums.length/2;
    }
  }
}