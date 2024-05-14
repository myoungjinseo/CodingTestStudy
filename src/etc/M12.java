package etc;

import java.util.Scanner;

public class M12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int answer = 0;
            int speed = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = 0;
                if (a != 0){
                    b = sc.nextInt();
                }
                if (a == 1){
                    speed += b;
                }
                if (a == 2){
                    speed -= b;
                }
                if (speed < 0){
                    speed = 0;
                }
                answer += speed;
            }
            System.out.printf("#%d %d%n",i,answer);
        }
    }
}
