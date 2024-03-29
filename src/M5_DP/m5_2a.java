// 문제 설명 : 배열에 한 칸 이상을 띄워서 합계의 최대 값을 구해야 하는 문제
package M5_DP;

import java.util.Scanner;

public class m5_2a {
    public static int [] d = new int[1000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        d[0] = arr[0];
        d[1] = Math.max(arr[0],arr[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i-1],d[i-2]+arr[i]);
        }
        System.out.println(d[n-1]);
    }
}
