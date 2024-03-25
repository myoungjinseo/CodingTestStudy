// 병사 배치하기
// 전투력이 높은 병사가 앞쪽에 오도록 내림차순으로 배치를 하고자 한다
// 그 과정에서 특정한 위치에 있는 병사를 열외시키는 방법을 이용한다.
// 남아있는 병사의 수가 최대가 되도록 하는 방법으로 열외되는 병사의 수를 구하시오
package M5_DP;

import java.util.Scanner;

public class M5_6 {
    static int [] arr = new int[2000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]){
                count +=1;
            }
        }

        System.out.println(count);
    }
}
