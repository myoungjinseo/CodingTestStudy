package etc;

import java.util.ArrayDeque;

public class M33 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(solution(n,k));

    }
    public static int solution(int n, int k){
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.addLast(i);
        }
        while(queue.size() > 1){
            for (int i = 0; i < k - 1; i++) {
                queue.addLast(queue.pollFirst());
            }
            queue.pollFirst();
        }
        return queue.pollFirst();
    }
}
