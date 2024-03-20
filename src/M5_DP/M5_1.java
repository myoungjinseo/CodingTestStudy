// 피보나치 수열
// 재귀 함수 이용시 빅오 표기법 O(2^n) 시간 소요
package M5_DP;

public class M5_1 {

    public static int fibo(int x) {
        if ( x == 1 || x == 2){
            return 1;
        }
        return fibo(x-1) + fibo(x-2);   // 재귀함수 이용
    }
    public static void main(String[] args) {
        System.out.println(fibo(100));
    }
}
