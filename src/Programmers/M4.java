// 올바른 괄호 프로그래머스 LV 2
package Programmers;

public class M4 {

    static boolean solution(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c < 0)
                return false;
            if (s.charAt(i) == '(')
                c += 1;
            else if (s.charAt(i) == ')')
                c -= 1;
        }
        return c == 0;
    }


    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }
}
