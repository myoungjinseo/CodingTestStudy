// 프로그래머스 피보나치 수
// 문제 핵심 -> DP 특성 알기 + 시간 복잡도 생각, 1234567 위치 알기
package Programmers;

import java.util.Scanner;

public class M3 {
    static long[] d = new long[100001];

    public static long fibo(int n) {
        d[1] = 1;
        d[2] = 1;
        if (n < 3) {
            return d[n];
        }
        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 1234567;
        }
        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long answer = fibo(n);
        System.out.println(answer);
    }

}
