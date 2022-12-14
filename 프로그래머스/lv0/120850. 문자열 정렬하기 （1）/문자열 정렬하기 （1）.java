import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(i, i+1).matches("^[^a-z]$")) {
                list.add(Integer.valueOf(my_string.substring(i, i+1)));
            }
        }

        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}