import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String star = "*";

        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < n; i++) {
            stringBuffer.append(star);
            System.out.println(stringBuffer);
        }
    }
}