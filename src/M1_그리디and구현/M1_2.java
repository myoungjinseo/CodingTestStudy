package M1_그리디and구현;
// 문제 : 1이 될 때까지
//  n에서 1을 빼거나 n을 k로 나눈다. 최소 카운트 값 구하기

public class M1_2 {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int cnt = 0;
        while(n !=1){   // n = 1 이 될 때까지
            int target = (n/k) * k; // 나머지가 0 인 수 구하기
            cnt += (n - target);    // 나머지값 카운트 1을 빼는 방법을 이용하기 때문
            n = target;
            if (n <k) break;    // n이 k보다 작을 경우 함수 나가기 why? 같은 결과 반복되기 때문
            cnt +=1;    // k를 나눈 횟수 더하기
            n /= k;     // n을 k로 나눈 값

        }
        cnt += (n-1);   // n이 1이 아닐때 break문으로 나올 경우를 대비해서
        System.out.println(cnt);
    }
}
