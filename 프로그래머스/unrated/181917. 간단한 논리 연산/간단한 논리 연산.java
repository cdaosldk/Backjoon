class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean x1Vx2 = true;
        boolean x3Vx4 = true;
        boolean x1Vx2VVx3Vx4 = false;

        if (!x1) {
            if (!x2) {
                x1Vx2 = false;
            }
        }

        if (!x3) {
            if (!x4) {
                x3Vx4 = false;
            }
        }

        if (x1Vx2) {
            if (x3Vx4) {
                x1Vx2VVx3Vx4 = true;
            }
        }

        return x1Vx2VVx3Vx4;
    }
}