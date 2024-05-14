package etc;

import java.util.Scanner;

public class M11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i <= t; i++) {
            int answer = 0;
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            for (int j = m1; j < m2; j++) {
                answer += arr[j];
            }
            answer -= d1;
            answer += d2+1;
            System.out.printf("#%d %d%n",i,answer);
        }
    }
}
