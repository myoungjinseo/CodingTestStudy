import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push" :
                    int a = Integer.parseInt(st.nextToken());
                    queue.add(a);
                    break;
                case "pop" :
                    sb.append(!queue.isEmpty() ? queue.pollFirst() : -1).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(!queue.isEmpty() ? queue.peekFirst() : -1).append("\n");
                    break;
                case "back" :
                    sb.append(!queue.isEmpty() ? queue.peekLast() : -1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}