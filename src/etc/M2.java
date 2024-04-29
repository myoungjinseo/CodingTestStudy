// 모험가 길드
// 공포도가 x인 모험가
// 공포도 x 인 모험가는 x명 이상 들어간 그룹에 최댓값을 구하는 문제
package etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int result = 0;
        Arrays.sort(arr, Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            count += 1;
            if (count > arr[i]){
                result += 1;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
