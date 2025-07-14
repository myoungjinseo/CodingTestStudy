import java.util.*;

class Solution {
    public static int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> queue = new ArrayDeque<>();
        int n = priorities.length;
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        int[] arr = priorities.clone();
        Arrays.sort(arr);

        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (arr[n - 1] == priorities[i]) {
                n--;
                priorities[i] = answer;
                answer++;
            } else {
                queue.add(i);
            }
        }
        return priorities[location];
    }
}