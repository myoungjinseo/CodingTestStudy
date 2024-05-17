package etc;

import java.util.Scanner;

public class M13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int [][] arr = new int[n][n];
            int a = 0;
            int b = 0;
            int [] dx = {1,0,-1,0};
            int [] dy = {0,1,0,-1};
            int move = 0;
            int num = n*n;
            for (int j = 1; j <= n; j++) {
                if (j == n){
                    move = 1;
                }
                arr[a][b] = j;
                a += dx[move];
                b += dy[move];
            }
            int c1 = n-1;
            int c2 = 2;
            int c3 = 0;
            for (int j = n+1; j <= num; j++) {
                arr[a][b] = j;
                c3 += 1;
                if (c3 == c1){
                    c2 -= 1;
                    if (c2 == 0){
                        c2 = 2;
                        c1 -= 1;
                    }
                    move +=1;
                    if (move == 4){
                        move = 0;
                    }
                    c3 = 0;
                }
                a += dx[move];
                b += dy[move];
            }
            System.out.printf("#%d%n",i);
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.printf("%d ",arr[k][j]);
                }
                System.out.printf("%n");
            }
        }
    }
}
