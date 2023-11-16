import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char currenCher = 'A'; currenCher <= 'Z'; currenCher++) {
            int count = 0;
            for (int i = 0; i < my_string.length(); i++) {
                if (currenCher == my_string.charAt(i)) {
                    count++;
                }
            }

            answer[currenCher - 'A'] = count;
        }
        
        for (char currenCher = 'a'; currenCher <= 'z'; currenCher++) {
            int count = 0;
            for (int i = 0; i < my_string.length(); i++) {
                if (currenCher == my_string.charAt(i)) {
                    count++;
                }
            }

            answer[currenCher - 'a' + 26] = count;
        }

        return answer;
    }
}