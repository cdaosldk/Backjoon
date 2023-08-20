import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                arrayList.add(s);
            }
        }

        return arrayList.toArray(String[]::new);
    }
}
