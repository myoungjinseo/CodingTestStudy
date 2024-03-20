// 피보나치 함수
// fibo(0)과 fibo(1)의 호출 수를 구하는 문제
package BOJ;

import java.util.Scanner;

public class M_1003 {
    public static long [] d = new long [100];
    public static long fibo(int x){
        // 피보나치 수의 0의 호출 수는 1부터 시작해서 피보나치 수열과 같은 원리
        d[0] = 1;
        d[2] = 1;
        d[3] = 1;
        if (x <4){
            return d[x];
        }
        // 피보나치 함수 반복문으로 구현
        for (int i = 4; i <= x; i++) {
            d[i] = d[i-1] + d[i-2];
        }
        return d[x];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            System.out.println(fibo(n) + " " +fibo(n+1));
        }

    }
}
