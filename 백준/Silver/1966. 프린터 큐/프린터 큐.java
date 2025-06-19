import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int [] arr = new int[a];
            int [] sortArr = new int[a];
            Queue<Integer> queue = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                queue.add(j);
            }
            sortArr = Arrays.stream(arr).sorted().toArray();
            int cnt = a-1;
            while (true) {
                int c = queue.poll();
                if(sortArr[cnt] == arr[c]){
                    if(c == b){
                        break;
                    }
                    cnt--;
                    arr[c] = 0;
                } else {
                    queue.add(c);
                }
            }
            System.out.println(a - cnt);
        }
    }

}
