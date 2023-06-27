package M1_그리디and구현;

import java.util.Scanner;

public class M1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputData = sc.nextLine();

        int x = inputData.charAt(1) - '0';
        int y = inputData.charAt(0) - 'a' + 1;


        // 말이 움직일 수 있는 경우의 수 8가지
        int[] dx = {-2, -1, 1, 2, 2, 1 ,- 1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;



        for (int i = 0; i < 8; i++) {
            // 말이 있을 수 있는 x와 y 값 넣어주기
            int nextX = x + dx[i];
            int nextY = y + dy[i];


            // 체크말이 판에 있는 지 체크해주는 if 문 && == and
            if (nextX >= 1 && nextX <= 8 && nextY >= 1 && nextY <= 8) {
                result += 1;
            }

        }
        System.out.println(result);
    }

}