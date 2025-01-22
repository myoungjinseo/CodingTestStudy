package Programmers;

public class M24 {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        M24 m24 = new M24();
        System.out.println(m24.solution(123));
    }
}
