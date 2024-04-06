// 가장 긴 감소하는 부분 수열 - 실버2
package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M_11722 {

    static int n;
    static ArrayList<Integer> v = new ArrayList<Integer>();
    static int[] dp = new int[2000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }
        Collections.reverse(v);
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (v.get(j) < v.get(i)) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }
        System.out.println(maxValue);
    }

}
