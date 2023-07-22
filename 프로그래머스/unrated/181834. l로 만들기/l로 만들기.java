class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {

            char characterToSb = myString.charAt(i) < 'l' ? 'l' : myString.charAt(i);

            sb.append(characterToSb);
        }

        return sb.toString();
    }
}