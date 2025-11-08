import java.util.*;

public class _16_symmetricPairs {

    public static void optimal(int[][] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int first, second;
        for (int[] a : arr) {
            first = a[0];
            second = a[1];
            if (hm.get(second) != null && hm.get(second) == first) {
                System.out.print("(" + first + " " + second + ") ");
            } else {
                hm.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2 },
                { 5, 6 },
                { 8, 4 },
                { 2, 1 },
                { 4, 5 },
                { 7, 6 },
                { 6, 5 }
        };
        optimal(a);
    }
}
