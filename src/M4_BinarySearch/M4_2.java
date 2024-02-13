/*
* 문제이름 : 떡볶이 떡 만들기
* 난이도 : 중간 풀이시간 : 40분 제한
* 나의 정답 : 못품 -> 해설지 답안 참고 주석 달기
* */

package M4_BinarySearch;

import java.util.Scanner;

public class M4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        // 1억을 end 값으로 설정
        int end = (int) 1e9;
        int result = 0;
        while (start <= end){
            long total = 0;
            int mid = (start + end)/2;

            // arr[i] 가 중간 값보다 작을 경우 모든 값 더해줌
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) total += arr[i] - mid;
            }

            // 구할 값보다 작을 경우 end 는 중간값보다 1 낮은 값으로 설정
            if (total < m){
                end = mid -1;
            }
            // 아닐 경우 result 값 저장 후 시작 값을 중간값보다 1 크게 설정
            else {
                result  = mid;
                start = mid +1;
            }
        }

        System.out.println(result);
    }
}
