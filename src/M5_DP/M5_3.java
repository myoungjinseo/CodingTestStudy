// 1로 만들기 문제 DP
// x가 2,3,5로 나누어지면 나누어 주고 아니면 1를 빼주어 연산 횟수를 최소화 해주는 문제
package M5_DP;

import java.util.Scanner;

public class M5_3 {

    public static void main(String[] args) {
        int [] d = new int[30001];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 모든 경우의 수를 구해줌 -> 2 ~ x 까지의 연산 횟수를 다 구해준다
        for (int i = 2; i <= x; i++) {
            // 우선 1를 뺀 연산 횟수를 추가해줌
            d[i] = d[i-1] +1;
            if(i%2==0){
                d[i] = Math.min(d[i],d[i/2]+1);  // 2를 나누어 주는 경우랑 1를 뺀 경우와 연산 횟수를 비교해서 낮은 값 넣어준다.
            }
            if (i%3 == 0) {
                d[i] = Math.min(d[i],d[i/3]+1);
            }
            if (i%5==0){
                d[i] = Math.min(d[i],d[i/5]+1);
            }
        }
        System.out.println(d[x]);
    }
}
