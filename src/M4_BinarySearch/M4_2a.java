// 시간 : 20분
package M4_BinarySearch;

import java.util.Scanner;

public class M4_2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = (int) 1e9;
        int result = 0;
        while (start <= end){
            int mid = (start + end)/2;
            long total = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) total += arr[i]-mid;
            }
            if (total <= m) {
                result = mid;
                end = mid-1;
            } else {
                start = mid +1;
            }
        }
        System.out.println(result);
    }
}
