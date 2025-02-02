package Programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M33 {
    public int solution(long num) {
        int answer = 0;
        while(num != 1){
            answer++;
            if(answer >= 500)
                return -1;
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        }
        return answer;
    }


    public static void main(String[] args) {
        M33 m = new M33();
        System.out.println(m.solution(6));
    }
}
