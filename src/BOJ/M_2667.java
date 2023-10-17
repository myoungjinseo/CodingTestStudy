package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class M_2667 {
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};

    private static int[] aparts = new int[25*25];
    private static int n;
    private static int apartNum = 0; //아파트 단지 번호의 수
    private static boolean[][] visited = new boolean[25][25]; //방문여부
    private static int[][] graph = new int[25][25]; //지도

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] ==1 && !visited[i][j] ){
                    apartNum ++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);
        for (int i = 0; i < aparts.length; i++) {
            if (aparts[i] == 0) {

            }else{
                System.out.println(aparts[i]);
            }
        }

    }

    private static void dfs(int x, int y) {
        visited[x][y] =true;
        aparts[apartNum]++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx <n && nx>=0 && ny <n && ny>=0){
                if (graph[nx][ny] ==1 && !visited[nx][ny] ){
                    dfs(nx,ny);
                }
            }
        }
    }
}
