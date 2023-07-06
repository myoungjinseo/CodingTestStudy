package M2_DFSandBFS;

import java.util.*;

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class M2_6 {

    public static int n, m;
    public static int[][] graph = new int[201][201];

    // 상 하 좌 우 방향
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y) {
        // 큐 구현
        Queue<Node> q = new LinkedList<>();

        q.offer(new Node(x, y));
        // 큐가 빌 때 까지 반복
        while(!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            // 4가지 방향 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 미로 찾기 공간을 벗어난 경우
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                // 벽인 경우
                if (graph[nx][ny] == 0) continue;

                // 처음 만날 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        // 목적지까지의 최단 거리 반환
        return graph[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        // 맵 정보 받아오기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // 결과 출력
        System.out.println(bfs(0, 0));
    }

}