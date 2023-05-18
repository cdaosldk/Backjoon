import java.util.HashMap;

class Solution {
  public String solution(String[] participant, String[] completion) {
    HashMap<String, Integer> hashMap = new HashMap<>();
    for (String player : participant) {
      hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
    }

    for(String player : completion) {
      hashMap.put(player, hashMap.get(player) - 1);
      if(hashMap.get(player) == 0) {
        hashMap.remove(player);
      }
    }
    return hashMap.keySet().iterator().next();
  }
}