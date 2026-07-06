class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();

        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            switch (mode) {
                case 0:
                    if (code.charAt(i) != '1' && i % 2 == 0) {
                        sb.append(code.charAt(i));
                    } else if (code.charAt(i) == '1') {
                        mode = 1;
                    }
                    break;
                case 1:
                     if (code.charAt(i) != '1' && i % 2 != 0) {
                         sb.append(code.charAt(i));
                     } else if (code.charAt(i) == '1') {
                        mode = 0;
                     }
                    break;
                default:
                    break;
            }
        }

        return !sb.isEmpty() ? sb.toString() : "EMPTY";
    }
}