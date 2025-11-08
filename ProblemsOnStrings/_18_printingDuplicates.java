
import java.util.Scanner;

public class _18_printingDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            if (ch == ' ')
                continue;
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) ('a' + i) + "-" + freq[i]);
            }
        }
        scan.close();
    }
}
