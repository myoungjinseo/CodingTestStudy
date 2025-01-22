package Programmers;

public class M21 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }

    public static void main(String[] args) {
        M21 m21 = new M21();
        System.out.println(m21.solution(2,5));
    }
}
