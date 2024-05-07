package Programmers;

public class M9 {
    public static int solution(String s) {
        int answer = 0;
        int n = s.length();
        int c = 0;
        if (String.valueOf(s.charAt(0)).equals("-")) {
            c += 2;
        } else if (String.valueOf(s.charAt(0)).equals("+")) {
            c += 1;
        } else {
            answer += Integer.parseInt(String.valueOf(s.charAt(0)));
        }
        for (int i = 1; i < n; i++) {
            answer *= 10;
            String a = String.valueOf(s.charAt(i));
            answer += Integer.parseInt(a);
        }
        if (c > 1) {
            answer *= -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }
}
