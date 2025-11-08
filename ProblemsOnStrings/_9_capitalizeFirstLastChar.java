import java.util.Scanner;

public class _9_capitalizeFirstLastChar {

    public static String capitalize(String s) {
        char ch[] = s.toCharArray();
        int start = 0, n = ch.length;
        while (start < n) {
            while (start < n && ch[start] == ' ') {
                ++start;
            }
            if (start >= n) {
                break;
            }
            int end = start;
            while (end < n && ch[end] != ' ') {
                ++end;
            }
            if (Character.isLowerCase(ch[start])) {
                ch[start] = Character.toUpperCase(ch[start]);
            }
            if (end - 1 > start && Character.isLowerCase(ch[end - 1])) {
                ch[end - 1] = Character.toUpperCase(ch[end - 1]);
            }
            start = end;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(capitalize(s));
        scan.close();
    }
}
