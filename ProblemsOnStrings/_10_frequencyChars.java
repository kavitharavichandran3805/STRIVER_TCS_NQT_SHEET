import java.util.Scanner;

public class _10_frequencyChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.print((char) ('a' + i));
                System.out.print(freq[i] + " ");
            }
        }
        scan.close();
    }
}
