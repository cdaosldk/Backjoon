import java.util.Scanner;

class Solution {
    public int add(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int quotient(int x, int y) {
        return x / y;
    }

    public int reminder(int x, int y) {
        return x % y;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(solution.add(x, y));
        System.out.println(solution.minus(x, y));
        System.out.println(solution.multiply(x, y));
        System.out.println(solution.quotient(x, y));
        System.out.println(solution.reminder(x, y));
    }
}