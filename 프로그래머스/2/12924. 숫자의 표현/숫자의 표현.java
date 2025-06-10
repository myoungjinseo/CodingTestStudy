class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int result = 0;
            for(int j = i; j <= n; j++){
                result += j;
                if(result > n)
                    break;
                if(result == n)
                    answer++;
                
                    
            }
        }
        return answer;
    }
}