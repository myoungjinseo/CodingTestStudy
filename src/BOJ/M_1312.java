// 실버 5 문제 
package BOJ;

import java.util.Scanner;

public class M_1312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int result = a % b;
        for (int i = 0; i < n-1; i++) {
            result *=10;
            result %=b;
        }
        result *= 10;
        System.out.println(result/b);
    }
}