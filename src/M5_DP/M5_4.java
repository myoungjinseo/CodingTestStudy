// 효율적인 화폐 구성 - 내 답안
// 화폐들의 개수를 최소화하여 합이 M원을 가지도록 하는 문제
package M5_DP;

import java.util.Scanner;

public class M5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] x = new int[n];
        int count = 0 ;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            count += m/x[i];
            m %= x[i];
        }
        if (m !=0){
            count = -1;
        }

        System.out.println(count);
    }
}
