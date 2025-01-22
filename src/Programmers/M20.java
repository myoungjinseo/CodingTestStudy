package Programmers;

import java.util.Arrays;

public class M20 {
    public double solution(int[] arr){
        return Arrays.stream(arr).average().orElseThrow();
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        M20 m20 = new M20();
        System.out.println(m20.solution(arr));
    }

}

