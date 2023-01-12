class Solution {
    public String solution(String rsp) {

        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < rsp.length(); i++) {
            if(rsp.charAt(i) == '2') {
                stringBuffer.append("0");
            } else if (rsp.charAt(i) == '0') {
                stringBuffer.append("5");
            } else {
                stringBuffer.append("2");
            }
        }

        return stringBuffer.toString();
    }
}