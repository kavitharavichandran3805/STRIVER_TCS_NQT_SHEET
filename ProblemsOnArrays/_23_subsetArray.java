import java.util.*;

public class _23_subsetArray {
    public static void main(String[] args) {
        int a1[] = { 1, 3, 4, 5, 2 };
        int a2[] = { 2, 4, 3, 1, 7, 5, 15 };
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < a2.length; i++) {
            hm.put(a2[i], true);
        }
        for (int i = 0; i < a1.length; i++) {
            if (!hm.containsKey(a1[i])) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");

    }
}
