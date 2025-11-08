import java.util.*;

public class _26_abundantNumber {
    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += (n / i);
                }
            }
        }
        sum -= n;
        return (sum > n);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (isAbundant(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
