package Programmers;

import java.util.Scanner;

public class M15 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int answer = 0;

        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i = 0; i < 10; i++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    answer += a;
                }
            }
            System.out.printf("#%d %d%n", test_case, answer);
            answer = 0;

        }
    }
}

