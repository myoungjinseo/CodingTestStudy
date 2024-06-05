package Programmers;

public class M19 {
    public static double solution(int[] arr) {
        double answer = 0;
        int n = arr.length;
        for (int j : arr) {
            answer += j;
        }
        answer /= n;
        return answer;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
}
