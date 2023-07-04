package M2_DFSandBFS;

// bfs 예제 문제
// bfs = 너비 우선 탐색 (가까운 노드부터 우선적으로 탐색하는 알고리즘) , 큐 자료구조 이용 -> 우선 인접한 노드 다 넣고 큐 형식으로 빼감
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class M2_4 {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        visited[start] = true;

        while (!q.isEmpty()){
            // 큐의 첫번째 요소 값을 꺼내고 x에 넣어줌
            int x = q.poll();
            System.out.print(x + " ");

            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);    // x에 인접한 노드를 말함
                if (!visited[y]){   // y가 방문하지 않았으면
                    q.offer(y);   // 큐에 넣어준다
                    visited[y] = true;  // 큐에 넣어준 값은 방문했다고 기록
                }
            }
        }
    }


    // [[],[2,3,8],[1,7],[1,4,5],[3,5],[3,4],[7],[2,6,8],[1,7]] 형태에 배열 만들고 dfs(1)부터 시작
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);
        bfs(1);

    }
}
