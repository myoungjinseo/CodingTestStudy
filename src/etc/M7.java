package etc;

import java.util.Scanner;

public class M7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 1; i <= testCase; i++) {
            int t = sc.nextInt();
            int answer = 0;
            for (int j = 1; j <= t; j++) {
                if (j % 2 == 0){
                    answer -= j;
                } else {
                    answer += j;
                }
            }
            System.out.printf("#%d %d%n",i,answer);
        }
    }
}
