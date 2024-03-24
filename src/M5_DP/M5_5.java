// 금광 문제
// n * m 테이블에서 오른쪽 위, 오른쪽, 오른쪽 아래 중 하나의 위치로만 이동이 가능하다
// 채굴자가 얻을 수 있는 금의 최대 크기를 구하는 문제
package M5_DP;

import java.util.Scanner;

public class M5_5 {
    static int testcase, n, m;
    static int [][] arr = new int[20][20];
    static int [][] dp = new int[20][20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 입력
        testcase = sc.nextInt();
        for (int tc = 0; tc < testcase; tc++) {
            n = sc.nextInt();
            m = sc.nextInt();
            // 금광 정보 입력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // 다미나믹 프로그래밍을 위한 2차원 DP테이블 초기화
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i][j] = arr[i][j];
                }
            }
            // 다이나믹 프로그래밍 진행
            for (int j = 1; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    int leftUp, leftDown, left;
                    // 왼쪽 위에서 오는 경우
                    if (i == 0) leftUp =0;
                    else leftUp = dp[i-1][j-1];
                    // 왼쪽 아래에서 오는 경우
                    if (i == n-1) leftDown = 0;
                    else  leftDown = dp[i+1][j-1];
                    // 왼쪽에서 오는 경우
                    left = dp[i][j-1];
                    dp[i][j] = dp[i][j] + Math.max(leftUp,Math.max(leftDown,left));
                }
            }

            int result = 0;
            for (int i = 0; i < n; i++) {
                result = Math.max(result,dp[i][m-1]);
            }

            System.out.println(result);
        }
    }
}
