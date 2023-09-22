import java.util.ArrayList;

class Solution {
    public String solution(String myString, String pat) {
        int length = 0;
        int maxLength = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= myString.length(); i++) {

            String substring = myString.substring(0, i);

            if (substring.endsWith(pat)) {
                length = substring.length();
                arrayList.add(length);
            }
        }

        for (Integer integer : arrayList) {
            if (maxLength <= integer) {
                maxLength = integer;
            }
        }

        return myString.substring(0, maxLength);
    }
}