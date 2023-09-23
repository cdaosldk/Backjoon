import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {

        myStr = myStr.replaceAll("[abc]", " ");
        ArrayList<String> arrayList = new ArrayList<>();

        String[] split = myStr.split(" ");

        for(String s : split) {
            if (!s.isEmpty()) {
                arrayList.add(s);
            }
        }

        boolean isEmpty = arrayList.stream().allMatch(String::isEmpty);

        if (!isEmpty) {
            return arrayList.toArray(new String[0]);
        } else {
            return new String[] {"EMPTY"};
        }
    }
}