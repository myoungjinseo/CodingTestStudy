package etc;

import java.util.Scanner;

public class M9 {
    public static int solution(String s, int num) {
        int cnt = 0;

        for (int i = 0; i < num/2; i++) {
            if (s.charAt(i) == s.charAt(num-i-1)){
                cnt += 1;
            }
        }

        if (cnt == num/2) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String s = sc.next();
            int num = s.length();
            System.out.printf("#%d %d%n",i,solution(s,num));
        }
    }
}
