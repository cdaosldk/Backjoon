public class Solution {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int numResult = num1 * num2;
        int denumResult = denum1 * num2 + denum2 * num1;
        int min = numResult > denumResult ? denumResult : numResult;
        int gcf = 0;
//        if (numResult > denumResult) {
//            min = denumResult;
//        } else {
//            min = numResult;
//        }
        for (int i = 1; i <= min; i++) {
            if( numResult % i == 0 && denumResult % i == 0) {
                gcf = i;
            }
        }

        if(gcf != 0) {
            denumResult /= gcf;
            numResult /= gcf;
        }

        answer[0] = denumResult;
        answer[1] = numResult;
        return answer;
        }
    }
