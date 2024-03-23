// 효율적인 화폐 구성 - 모범 답안
// 화폐들의 개수를 최소화하여 합이 M원을 가지도록 하는 문제
package M5_DP;

import java.util.Arrays;
import java.util.Scanner;

public class M5_4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // N개의 화폐 단위 정보를 입력받기
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] d = new int[m+1];        // DP 테이블 초기화
        Arrays.fill(d,10001);
        // DP 진행 보텀업
        d[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                // (i - k)원을 만드는 방법이 존재하는 경우
                if (d[j-arr[i]] != 10001){
                    d[j] = Math.min(d[j],d[j-arr[i]]+1);
                }
            }
        }
        if (d[m] == 10001){
            System.out.println(-1);
        }else {
            System.out.println(d[m]);
        }
    }
}
