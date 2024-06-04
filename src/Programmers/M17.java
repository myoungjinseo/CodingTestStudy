package Programmers;

public class M17 {
    public static long solution(long n){
        long answer = -1;
        double i = Math.sqrt(n);
        if (i % 1 == 0){
            answer = (long) Math.pow(i+1,2);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
