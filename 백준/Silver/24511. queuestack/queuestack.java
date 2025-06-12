import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] type = new int[n];
        for (int i = 0; i < n; i++) {
            type[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(type[i] == 0)
                queue.addLast(a);
        }

        int num = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(st.nextToken());
            queue.addFirst(a);
            if(i == num - 1){
                sb.append(queue.pollLast());
                break;
            }
            sb.append(queue.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}
