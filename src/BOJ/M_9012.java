// 백준 - 괄호 문제
package BOJ;

import java.util.Scanner;

public class M_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(solution(arr[i]));
        }
    }
    static String solution(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c < 0)
                return "NO";
            if (s.charAt(i) == '(')
                c += 1;
            else if (s.charAt(i) == ')')
                c -= 1;
        }
        if (c == 0){
            return "YES";
        }
        return "NO";
    }


}
