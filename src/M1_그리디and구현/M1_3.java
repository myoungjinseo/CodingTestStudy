package M1_그리디and구현;

import java.util.Scanner;

// 문자열 받아서 + 나 *를 해서 가장 큰 값 만들기
public class M1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 받아오기

        long result = str.charAt(0) - '0';  // 첫 번째 문자열 숫자로 바꾸기
        for (int i = 1; i < str.length(); i++) {
            // '0' 을 빼는 이유 int 선언 후 charat값을 넣어주면 아스키코드 값인 1일 경우 49가 나옴 0을 빼주면서 0= 48 본래의 값이 나올 수 있게 됨
            int num = str.charAt(i) - '0';
            if(num <= 1 || result <=1){     // 0이거나 1일 때는 더하기를 해야 값이 증가됨
                result += num;
            }
            else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}
