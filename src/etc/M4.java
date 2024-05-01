package etc;

import java.util.Arrays;
import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = 1;
        for (int i : arr) {
            if (result < i) break;
            result += i;
        }
        System.out.println(result);

    }
}
