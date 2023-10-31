import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        int flag = 0;
        int location = 0;

        for (int i = 0; i < str_list.length; i++) {
            if ("l".equals(str_list[i])) {
                flag = 1;
                location = i;
                break;
            } else if ("r".equals(str_list[i])) {
                flag = 2;
                location = i;
                break;
            }
        }

            switch (flag) {
                case 1:
                    answer.addAll(Arrays.asList(str_list).subList(0, location));
                    break;
                case 2:
                    answer.addAll(Arrays.asList(str_list).subList(location + 1, str_list.length));
                    break;
            }

            return answer.toArray(new String[0]);
    }
}