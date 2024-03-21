package M5_DP;

import java.util.Scanner;

public class M5_2 {
    public static long[] d = new long[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        d[2] += d[0];
        for (int i = 3; i < n; i++) {
            if (d[i-2] < d[i-3]){
                d[i] += d[i-3];
            } else {
                d[i] += d[i-2];
            }
        }

        if (d[n-1] < d[n-2]){
            d[n-1] = d[n-2];
        }
        System.out.println(d[n-1]);
    }
}
