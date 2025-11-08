import java.util.*;

public class _13_highestRepeated {
    public static String findWord(String str) {
        String[] words = str.split(" ");
        String result = "-1";
        int maxRepeat = 1; // initially no repeats

        for (String word : words) {
            int[] freq = new int[26]; // for a–z letters
            int localMax = 1;

            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    freq[ch - 'a']++;
                    localMax = Math.max(localMax, freq[ch - 'a']);
                }
            }

            if (localMax > maxRepeat) {
                maxRepeat = localMax;
                result = word;
            }
        }

        return (maxRepeat == 1) ? "-1" : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        System.out.println(findWord(input));
        sc.close();
    }
}
