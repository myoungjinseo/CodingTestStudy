package Programmers;

public class M25 {
    public String solution(int num) {
        if(num%2==0)
            return "Even";
        return "Odd";
    }
    public static void main(String[] args) {
        M25 m25 = new M25();
        System.out.println(m25.solution(3));
    }
}
