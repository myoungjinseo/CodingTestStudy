package Programmers;

public class M10 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0){
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
