// 무지의 먹방 라이브
// 정화겅 테스트 통과 효율성 테스트 불통과
// 채점 결과 42.9점
package etc;

import java.util.Arrays;

public class M6 {
    public static int solution(int[] food_times, long k) {
        int answer = 0;
        int num = food_times.length-1;
        int sum = Arrays.stream(food_times).sum();
        if (num < 1 || num >2000 || k < 1 || k >2000000){
            return -1;
        }
        if( sum < k ){
            return -1;
        }
        int i = 0;
        int cnt =0;
        while(i != k+1){
            answer += 1;
            cnt ++;
            answer %=  num+1;
            if(answer == 0){
                answer = num+1;
            }
            if(food_times[answer - 1] != 0){
                food_times[answer - 1] -= 1;
                i++;
            }
            if (cnt > 100000000) {
                return -1;
            }
        }
        sum = Arrays.stream(food_times).sum();
        if( sum < 0 ){
            return -1;
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println(solution(arr, 5));
    }
}
