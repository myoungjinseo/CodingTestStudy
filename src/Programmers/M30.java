package Programmers;


import java.util.Arrays;
import java.util.Comparator;

public class M30 {
    public long solution(long n) {
        long answer = 0;
        // Math.sqrt(n) 사용안하고 풀기
        for (long i = 1; i < 8000000; i++) {
            if (n == i * i)
                return (i+1) * (i+1);
        }
        return -1;
    }

    public static void main(String[] args) {
        M30 m = new M30();
        System.out.println(m.solution(121));
    }
}
