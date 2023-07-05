package M2_DFSandBFS;

// 음료수 얼려 먹기 예제 풀이 주석 달기

import java.util.Scanner;

public class M2_5 {
    // 세로길이 , 가로길이
    public static int n, m;

    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y){

        // 배열 밖으로 갈 경우 return false
        if(x <= -1 || x>= n || y<= -1 || y>= m){
            return false;
        }

        // graph 값이 0인 경우 1로 변경 후 인접한 곳 검사
        if (graph[x][y] ==0){
            graph[x][y] =1;
            dfs(x-1,y);
            dfs(x,y-1);
            dfs(x+1,y);
            dfs(x,y+1);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();      // 개행 문자 제거하기 위해

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();     // 2차원 배열 받아오기
            for (int j = 0; j < m; j++) {
                graph[i][j] =str.charAt(j) - '0';
            }
        }

        int result = 0;

        // 음료수 구역 알고리즘 실행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i,j)){  // 검사
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
