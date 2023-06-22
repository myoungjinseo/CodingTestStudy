package M1_그리디and구현;
// 거스름돈 문제(그리디)
public class M1_1 {
    public static void main(String[] args) {
        int n = 1260;
        int cnt =0;
        // 가장 큰 동전부터 배열
        int [] coinTypes = {500,100,50,10};

        for (int i = 0; i < 4; i++) {
            cnt += n/coinTypes[i];      // 카운트 += 전체 값 / 동전
            n %= coinTypes[i];      // n / coinType[i] 의 나머지 값
        }

        System.out.println(cnt);
    }
}
