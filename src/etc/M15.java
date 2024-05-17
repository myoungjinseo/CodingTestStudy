package etc;

import java.util.Arrays;
import java.util.Scanner;

public class M15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int [] arr = new int[101];
            int n = sc.nextInt();
            int max = 0;
            int maxCnt = 0;
            for (int j = 0; j < 1000; j++) {
                int a = sc.nextInt();
                arr[a] += 1;
            }
            for (int j = 0; j < 101; j++) {
                if (maxCnt <= arr[j]){
                    max = j;
                    maxCnt = arr[j];
                }
            }
            System.out.printf("#%d %d%n",n,max);
        }
    }
}
