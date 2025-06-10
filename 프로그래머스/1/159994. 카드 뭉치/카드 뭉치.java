import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        ArrayDeque<String> queue1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> queue2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalQueue = new ArrayDeque<>(Arrays.asList(goal));
        
        for(String s : goal){
            if(s.equals(queue1.peekFirst())){
                queue1.pollFirst();
                goalQueue.pollFirst();                
                continue;
            } else if(s.equals(queue2.peekFirst())){
                queue2.pollFirst();
                goalQueue.pollFirst();
                continue;
            } else{
                return "No";
            }
        }
        return goalQueue.isEmpty() ? "Yes" : "NO";
    }
}