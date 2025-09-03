import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder builder = new StringBuilder(a);

        for (int i = 0; i < builder.length(); i++) {
            if (Character.isUpperCase(builder.charAt(i))) {
                builder.setCharAt(i, Character.toLowerCase(builder.charAt(i)));
            } else {
                builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
            }
        }

        System.out.println(builder.toString());
    }
}