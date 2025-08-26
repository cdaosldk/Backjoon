import java.util.Scanner;

class Solution {
    public int solution(int x, int y) {
        return x * y;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        System.out.println(solution.solution(x, y));
    }
}