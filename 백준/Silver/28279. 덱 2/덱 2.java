import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int r = 0;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch(a){
                case 1:
                    r = Integer.parseInt(st.nextToken());
                    deque.addFirst(r);
                    break;
                case 2:
                    r = Integer.parseInt(st.nextToken());
                    deque.addLast(r);
                    break;
                case 3:
                    sb.append(!deque.isEmpty() ? deque.pollFirst() : -1).append("\n");
                    break;
                case 4:
                    sb.append(!deque.isEmpty() ? deque.pollLast() : -1).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    sb.append(!deque.isEmpty() ? deque.peekFirst() : -1).append("\n");
                    break;
                case 8:
                    sb.append(!deque.isEmpty() ? deque.peekLast() : -1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}