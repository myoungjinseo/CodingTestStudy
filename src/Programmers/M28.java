package Programmers;


public class M28 {
    public long solution(int a, int b) {
        long answer = 0;
        if (b < a){
            int c = a;
            a = b;
            b = c;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        M28 m27 = new M28();
        System.out.println(m27.solution(3,5));
    }
}
