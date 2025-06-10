import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < answer.length; i++){
            int[] result = new int[commands[i][1] - commands[i][0] + 1];            
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            for(int j = a; j <= b; j++){
                result[j-a] = array[j-1];
            }
            Arrays.sort(result);
            answer[i] = result[c-1];
        }
        return answer;
    }
}