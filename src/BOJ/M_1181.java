// 단어 정렬
package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class M_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        arr = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(arr);
        Arrays.sort(arr,(String s1, String s2) -> s1.length() - s2.length());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
