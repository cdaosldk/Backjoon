import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String s = my_string.toLowerCase();
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c;
            list.add(num);
        }
        list.sort(Integer::compareTo);
        for(int j = 0; j < list.size(); j++) {
            stringBuilder.append((char)(int)list.get(j));
        }
        return stringBuilder.toString();
    }
}