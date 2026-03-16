import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{

  static int n,m;
  static int[][] maze;
  static boolean[][] visited;
  static int[] dx = {0,1,0,-1};
  static int[] dy = {1,0,-1,0};
  public static void main(String[] args) throws IOException{

    // 입력 값 받아오기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    maze = new int[n][m];
    visited = new boolean[n][m];


    // for문으로 값 쪼개기
    for(int i = 0; i < n; i++){
      String word = br.readLine();
      for(int j = 0; j < m; j++){
        maze[i][j] = Integer.parseInt(word.substring(j, j+1));
      } 
    }


    // 좌표 0,0부터 bfs 시작 
    bfs(0,0);

    System.out.println(maze[n-1][m-1]);

    br.close();
  }

  private static void bfs(int x, int y){

    // 기본 값 만들기
    Queue<int[]> que = new ArrayDeque<>();
    que.add(new int[]{x,y});
    visited[x][y] = true;


    // 비어 있지 않을 경우
    while (!que.isEmpty()){

      // 현재 값 나오기
      int[] now = que.poll();


      // 방향에 따른 값 루프
      for(int k = 0; k < 4; k++){
        int i = now[0] + dx[k];
        int j = now[1] + dy[k];

        // 장외가 아닐경우
        if(i >= 0 && j >= 0 && i < n && j < m){

          // 방문하지 않으면서 값이 1인 경우
          if(maze[i][j] == 1 && !visited[i][j]){
            visited[i][j] = true;
            
            // 현재 값에 1 더하기 
            maze[i][j] = maze[now[0]][now[1]] + 1;

            // que에 넣어줘서 while문 실행하게 하기
            que.add(new int[]{i,j});
          }
        } 
      }
    }
  }  
}
