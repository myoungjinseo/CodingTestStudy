import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;
        
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        
        for(String key : keyinput){
            int moveX = 0;
            int moveY = 0;
            if(key.equals("up")){
                moveX = dx[0];
                moveY = dy[0];
            } else if(key.equals("down")){
                moveX = dx[1];
                moveY = dy[1];
            } else if(key.equals("left")){
                moveX = dx[2];
                moveY = dy[2];
            } else if(key.equals("right")){
                moveX = dx[3];
                moveY = dy[3];
            }
            int newX = answer[0] + moveX;
            int newY = answer[1] + moveY;
            if(newX >= -maxX && newX <= maxX){
                answer[0] = newX;
            }
            if(newY >= -maxY && newY <= maxY){
                answer[1] = newY;
            }
        }
        return answer;
    }
}