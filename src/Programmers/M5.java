// 최솟값 만들기
package Programmers;

import java.util.Arrays;

public class M5 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] A = {1,4,2};
        int [] B = {5,4,4};
        int answer = solution(A,B);
        System.out.println(answer);
    }
}
