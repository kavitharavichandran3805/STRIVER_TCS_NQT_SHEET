import java.util.*;

public class _21_equilibriumIndex {

    // time comp - o(2n) space comp - o(2n)
    public static int approach1(int[] a) {
        int left_sum = 0, right_sum = 0;
        int i = 1, j = a.length - 2;
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        left[0] = 0;
        right[a.length - 1] = 0;
        while (i < a.length && j >= 0) {
            left_sum += a[i - 1];
            right_sum += a[j + 1];
            left[i] = left_sum;
            right[j] = right_sum;
            ++i;
            --j;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for (int index = 0; index < a.length; index++) {
            if (left[index] == right[index]) {
                return index;
            }
        }
        return -1;
    }

    public static int approach2(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int left_sum = 0, right_sum = sum;
        for (int i = 0; i < a.length; i++) {
            right_sum -= a[i];
            if (left_sum == right_sum) {
                return i;
            }
            left_sum += a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] a = { 2, 3, -1, 8, 4 };
        int[] a = { 1, -1, 4 };
        int result = approach1(a);
        System.out.println(result);
        int result1 = approach2(a);
        System.out.println(result1);
    }
}
