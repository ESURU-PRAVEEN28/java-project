public class Pattern4 {
    public static void main(String[] args) {
        int n = 10;
        int k = 2 * n - 1;

        for (int i = 1; i <= k; i++) {
            int limit;
            if (i <= n) {
                limit = i;
            } else {
                limit = k - i + 1;
            }

            for (int j = 1; j <= limit; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
