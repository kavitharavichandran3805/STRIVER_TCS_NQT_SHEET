import java.util.Scanner;

public class _19_removeDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.toString().indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        scan.close();
    }
}
