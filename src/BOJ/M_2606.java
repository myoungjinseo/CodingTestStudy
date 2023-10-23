package BOJ;

import java.io.*;
import java.util.*;

public class M_2606 {
    static boolean[] visited;
    static int[][] graph;
    static int count = 0;
    static int com, n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        com = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        graph = new int[com+1][com+1];
        visited = new boolean[com + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }
        dfs(1);
        System.out.println(count-1);

    }

    public static void dfs(int start) {

        visited[start] = true;
        count ++;

        for (int i = 0; i <= com; i++) {
            if (!visited[i] && graph[start][i] ==1)
                dfs(i);
        }

    }
}
