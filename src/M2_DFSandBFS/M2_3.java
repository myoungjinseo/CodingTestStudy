package M2_DFSandBFS;

// DFS 소스코드 예제
// DFS == 깊이 우선 탐색 기법으로 번호가 낮은 인접 노드부터 이동한다.

import java.util.ArrayList;

public class M2_3 {

    // [9] 인 이유 == 1 ~ 8 까지 방문 리스트이다 -> 문제들이 보통 1부터 시작되는 경우가 많아서
    public static boolean[] visited = new boolean[9];

    // 배열안에 배열 넣어줌 why? 노드라는 배열안에 노드에 연결된 노드들을 넣기 위해
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void dfs(int x){

        visited[x] = true;
        System.out.print(x + " ");
        // .get은 배열에 몇번째 인자를 말한다
        for (int i = 0; i < graph.get(x).size(); i++) {     // size는 컬렉션프레임워크(list, set, map) 타입의 길이
            int y = graph.get(x).get(i);    //
            if (!visited[y]) dfs(y);        // visited가 false일 경우(즉, 방문을 안한 경우) dfs(y)를 실행한다
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
        dfs(1);

    }
}
