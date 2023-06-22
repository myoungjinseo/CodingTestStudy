package M1_그리디and구현;

// 상하좌우 문제
// 시작 좌표 항상 1,1 방향 구호에 맞는 (x,y) 좌표 구하기

import java.util.*;

public class M1_5 {

     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();
            String[] plans = sc.nextLine().split(" ");      // 이동 계획 받아오기
            int x = 1, y = 1;       // 시작 좌표

            int[] dx = {0, 0, -1, 1};       // x 좌표 이동
            int[] dy = {-1, 1, 0, 0};       // y 좌표 이동
            char[] moveTypes = {'L', 'R', 'U', 'D'};

            for (int i = 0; i < plans.length; i++) {
                char plan = plans[i].charAt(0);
                int nx = -1, ny = -1;   // -1 설정 이유 1,1 에서 시작하기 때문에
                for (int j = 0; j < 4; j++) {   // 4 중 하나
                    if (plan == moveTypes[j]) { // L R U D 에 따른 이동
                        nx = x + dx[j];
                        ny = y + dy[j];
                    }
                }
                if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
                x = nx;
                y = ny;
            }

            System.out.println(x + " " + y);
        }

    }