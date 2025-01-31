package Programmers;

import java.lang.Math;
import java.util.Arrays;

public class M27 {
    public long [] solution(long n){
        int j = (int)  Math.abs(Math.log10(n)) + 1;
        long[] answer = new long[j];
        int i = 0;
        while(n != 0){
            answer[i] =  n%10;
            n /= 10;
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        M27 m27 = new M27();
        System.out.println(Arrays.toString(m27.solution(12345)));
    }
}
