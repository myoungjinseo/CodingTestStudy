package Programmers;

public class M23 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<= n; i++){
            if(n % i == 0)
                answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        M23 m23 = new M23();
        System.out.println(m23.solution(12));
    }
}
