package etc;

import java.util.Scanner;

public class M20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int [][] arr = new int[9][9];
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            System.out.printf("#%d %d%n",i,solution(arr));
        }
    }

    public static int solution(int[][] arr) {

        for (int i = 0; i < 9; i++) {
            int a = 0;
            for (int j = 0; j < 9; j++) {
                a += arr[i][j];
            }
            if (a != 45){
                return 0;
            }
        }
        for (int i = 0; i < 9; i++) {
            int a = 0;
            for (int j = 0; j < 9; j++) {
                a += arr[j][i];
            }
            if (a != 45){
                return 0;
            }
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            int a = 0;
            for (int j = x; j < x+3; j++) {
                for (int k = y; k < y+3; k++) {
                    a += arr[j][k];
                }
            }
            if (a != 45){
                return 0;
            }
            x += 3;
            if (x == 9){
                x = 0;
                y += 3;
            }
        }


        return 1;
    }
}
