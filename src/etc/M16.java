package etc;

import java.util.Scanner;

public class M16 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int max = 0;
            int [][] arr = new int[m][m];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    int m1 = 0;
                    for (int l = 0; l < n; l++) {
                        for (int o = 0; o < n; o++) {
                            if (j+l < m && k+o <m){
                                m1 += arr[j+l][k+o];
                            }
                        }
                    }
                    if (max < m1){
                        max  = m1;
                    }
                }
            }
            System.out.printf("#%d %d%n",i,max);

        }
    }
}
