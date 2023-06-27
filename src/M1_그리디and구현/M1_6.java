package M1_그리디and구현;

import java.util.Scanner;

// 00시 00분 00초부터 N시 59분 59초 까지 구하는 문제

public class M1_6 {
    public static boolean check(int h, int m, int s) {
        // 시간에만 나누기를 안한 이유 => 30시간 이상이 될 수 없기 때문에 || == or
        if (h % 10 == 3 || m/10 == 3 || m % 10 ==3 || s/10 == 3 || s % 10 ==3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h =sc.nextInt();
        int cnt =0;

        // h시 59분 59초까지 카운트 해주는 함수
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i,j,k)) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
