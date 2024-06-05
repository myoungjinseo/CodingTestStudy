package Programmers;

public class M18 {
    public static String solution(int num) {
        String answer = "Odd";
        if(num % 2 == 0){
            answer = "Even";
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
