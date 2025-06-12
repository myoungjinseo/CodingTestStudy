import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            deque.addLast(i);
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt;
        int r = deque.pollFirst();
        int a = arr[r];
        sb.append(r+1).append(" ");
        A : for (int i = 0; i < n-2; i++) {
            for(int j = 0; j != a; j += cnt){
                if(a > 0){
                    if(j == a-1){
                        r = deque.pollFirst();
                        a = arr[r];
                        sb.append(r+1).append(" ");
                        continue A;
                    }
                    deque.addLast(deque.pollFirst());
                    cnt = 1;
                } else {
                    if(j == a+1){
                        r = deque.pollLast();
                        a = arr[r];
                        sb.append(r+1).append(" ");
                        continue A;
                    }
                    deque.addFirst(deque.pollLast());
                    cnt = -1;

                }
            }
        }
        r = deque.pollFirst();
        sb.append(r+1);
        System.out.println(sb);
    }
}
