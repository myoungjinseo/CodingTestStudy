import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 1; i < n+1; i++){
            queue.add(i);
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(!queue.isEmpty()){
            for(int i = 0; i < k; i++){
                if(i == k-1){
                    arr[cnt] = queue.poll();
                    cnt++;
                }else {
                    queue.add(queue.poll());
                }
            }
        }
        sb.append("<");
        for(int i = 0; i < n-1; i++){
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(arr[n-1]);
        sb.append(">");
        System.out.println(sb);
    }
}