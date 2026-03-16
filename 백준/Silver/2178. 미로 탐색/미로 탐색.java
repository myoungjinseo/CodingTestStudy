
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
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    maze = new int[n][m];
    visited = new boolean[n][m];

    for(int i = 0; i < n; i++){
      String word = br.readLine();
      for(int j = 0; j < m; j++){
        maze[i][j] = Integer.parseInt(word.substring(j, j+1));
      } 
    }

    bfs(0,0);

    System.out.println(maze[n-1][m-1]);

    br.close();
  }

  private static void bfs(int x, int y){
    Queue<int[]> que = new ArrayDeque<>();
    que.add(new int[]{x,y});
    visited[x][y] = true;

    while (!que.isEmpty()){
      int[] now = que.poll();

      for(int k = 0; k < 4; k++){
        int i = now[0] + dx[k];
        int j = now[1] + dy[k];

        if(i >= 0 && j >= 0 && i < n && j < m){
          if(maze[i][j] == 1 && !visited[i][j]){
            visited[i][j] = true;
            maze[i][j] = maze[now[0]][now[1]] + 1;
            que.add(new int[]{i,j});
          }
        } 
      }
    }
  }  
}
