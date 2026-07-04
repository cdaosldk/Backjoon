import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        
        while (true) {
            String binaryStr = Integer.toBinaryString(i);
            
            String replacedStr = binaryStr.replace('1', '5');
            
            int num = Integer.parseInt(replacedStr);
            
            if (num > r) {
                break;
            }
            
            // l 이상 r 이하인 경우에만 리스트에 추가
            if (num >= l) {
                list.add(num);
            }
            
            i++;
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}