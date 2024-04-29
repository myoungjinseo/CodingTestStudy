// 곱하기 혹은 더하기
// 문자열에 각자리를 곱하거나 더해서 가장 큰 수를 만드는 문제
package etc;

import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            int num = a.charAt(i)-'0';
            if (num < 2 || result == 0){
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }

}
