import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            list.add(n % 3);
            n /= 3;
        }
        int cnt = list.size() - 1;
        for(int i : list){
            answer += (int) (i * Math.pow(3,cnt--));
        }
        return answer;
    }
}