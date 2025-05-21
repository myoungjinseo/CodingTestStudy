import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = progresses.length;
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        int cnt = 0;
        int maxDay = answer[0];
        
        for(int i = 0; i < n; i++){
            if(answer[i] <= maxDay){
                cnt++;
            }
            else {
                queue.addLast(cnt);
                cnt = 1;
                maxDay = answer[i];
            }
        }
        queue.add(cnt);
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
}