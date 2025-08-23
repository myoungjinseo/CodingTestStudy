import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int a = (100-progresses[i]) /speeds[i];
            if((100-progresses[i]) % speeds[i] == 0)
                queue.add(a);
            else
                queue.add(a + 1);
        }
        int cnt = 1;
        int b = queue.poll();
        while (!queue.isEmpty()) {
            if(b >= queue.peek()){
                queue.poll();
                cnt++;
            } else {
                b = queue.poll();
                answer.add(cnt);
                cnt = 1;
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}