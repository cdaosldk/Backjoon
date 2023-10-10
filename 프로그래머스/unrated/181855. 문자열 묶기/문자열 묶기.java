import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        // 문자열 길이별 그룹을 저장할 Map 생성
        Map<Integer, Integer> groupCount = new HashMap<>();

        // 문자열 배열을 순회하면서 그룹별로 묶어서 개수를 카운트
        for (String str : strArr) {
            int len = str.length();
            groupCount.put(len, groupCount.getOrDefault(len, 0) + 1);
        }

        // 가장 개수가 많은 그룹 크기 찾기
        int maxGroupSize = 0;
        for (int count : groupCount.values()) {
            maxGroupSize = Math.max(maxGroupSize, count);
        }

        return maxGroupSize;
    }
}