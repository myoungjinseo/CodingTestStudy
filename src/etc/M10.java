package etc;

import java.util.Arrays;
import java.util.Scanner;

public class M10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.printf("#%d ", i);
            for (int j = 0; j < n-1; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.printf(arr[n-1]+"%n");
        }
    }
}
