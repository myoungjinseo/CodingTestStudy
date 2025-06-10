import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        answer.add(arr[0]);
        for(int i : arr){
            if(!stack.isEmpty() && stack.pop() != i)
                answer.add(i);
            stack.add(i);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}