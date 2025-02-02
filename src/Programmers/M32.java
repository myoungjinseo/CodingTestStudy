package Programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M32 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        Arrays.stream(arr).filter(i -> i % divisor == 0).forEach(list::add);
        if (list.isEmpty())
            list.add(-1);
        answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }


    public static void main(String[] args) {
        M32 m = new M32();
        int [] arr = {5,9,7,10};
        System.out.println(m.solution(arr,5));
    }
}
