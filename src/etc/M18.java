package etc;

import java.util.Scanner;

public class M18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int l = sc.nextInt();
            int u = sc.nextInt();
            int x = sc.nextInt();
            if (x <= l) {
                System.out.printf("#%d %d%n", i, l - x);
            } else if (u < x) {
                System.out.printf("#%d %d%n", i, -1);
            } else {
                System.out.printf("#%d %d%n", i, 0);
            }

        }
    }
}
