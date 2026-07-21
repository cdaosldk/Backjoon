import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();

        int x = 0;
        int y = 0;

        for (int i = 0; i < dirs.length(); i++) {
            int nx = x;
            int ny = y;

            switch (dirs.charAt(i)) {
                case 'U': ny++; break;
                case 'D': ny--; break;
                case 'R': nx++; break;
                case 'L': nx--; break;
            }

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }

            String path1 = x + "," + y + "->" + nx + "," + ny;
            String path2 = nx + "," + ny + "->" + x + "," + y;

            visited.add(path1);
            visited.add(path2);

            x = nx;
            y = ny;
        }

        return visited.size() / 2;
    }
}