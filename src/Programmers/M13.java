package Programmers;

import java.util.*;

public class M13 {


    public static long solution(long n) {
        long answer = 0;
        int s = (int) Math.log10(n) + 1;
        Long[] arr = new Long[s];
        for (int i = 0; i < s; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < s; i++) {
            answer *= 10;
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}

