package Programmers;


import java.util.Arrays;
import java.util.Comparator;

public class M29 {
    public long solution(long n) {
        long answer = 0;
        int i = (int)  Math.abs(Math.log10(n)) + 1;
        Long [] arr = new Long[i];

        for (int j = 0; j < i; j++) {
            arr [j] = n%10;
            n /= 10;
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        for (int j = 0; j < i; j++) {
            answer *= 10;
            answer += arr[j];
        }
        return answer;
    }

    public static void main(String[] args) {
        M29 m = new M29();
        System.out.println(m.solution(118372));
    }
}
