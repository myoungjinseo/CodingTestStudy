// 주유소 문제
// 58점 부분 정답 -> 100점을 예시를 확인해 본 결과 Buffer를 사용해야함
// 결과 확인 전 코드 작성!!
package BOJ;

import java.util.Scanner;

public class M_13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] a = new long[n-1];
        long [] b = new long[n];
        int result = 0;
        long min = (int) 1e9;
        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if (min > b[i]){
                min = b[i];
            }
            result += min * a[i];
        }
        System.out.println(result);
    }
}
