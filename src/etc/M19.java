package etc;

import java.util.Arrays;
import java.util.Scanner;

public class M19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int t = sc.nextInt();
            int [] arr = new int[100];
            for (int j = 0; j < 100; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < t; j++) {
                Arrays.sort(arr);
                arr[99] -= 1;
                arr[0] += 1;
            }
            Arrays.sort(arr);
            System.out.printf("#%d %d%n",i, arr[99]-arr[0]);
        }
    }
}
