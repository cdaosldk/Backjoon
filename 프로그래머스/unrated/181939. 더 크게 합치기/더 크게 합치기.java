class Solution {
    public int solution(int a, int b) {
        String aPlusB = String.valueOf(a) + b;

        String bPlusA = String.valueOf(b) + a;
        
        return Math.max(Integer.parseInt(aPlusB), Integer.parseInt(bPlusA));
    }
}