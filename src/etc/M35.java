package etc;

import java.util.ArrayDeque;
import java.util.Queue;

public class M35{
    public static void main(String[] args){
        int n = 5;
        int k = 3;
        System.out.print(solution(n,k));
    }
    public static int solution(int n , int k){
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            for (int j = 1; j < k; j++) {
                int a = queue.poll();
                if(j == k-1)
                    break;
                queue.add(a);
            }
            if(queue.size() == 1){
                answer = queue.poll();
                break;
            }
        }
        return answer;
    }
}
