package Programmers;

import java.util.Arrays;

public class M26 {
    public int solution(int n){
        int i = 1;
        while (n % i != 1){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        M26 m26 = new M26();
        System.out.println(m26.solution(10));
    }
}
