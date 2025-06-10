import java.util.ArrayDeque;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int a = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0 && (100 - progresses[i]) / speeds[i] > 0)
                a++;
            queue.add(a);
        }
        int b = queue.poll();
        int cnt = 1;
        while(!queue.isEmpty()){
            int c = queue.poll();
            if(b < c){
                answer.add(cnt);
                b = c;
                cnt = 0;
            }
            cnt++;
        }
        if(cnt > 0)
            answer.add(cnt);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}