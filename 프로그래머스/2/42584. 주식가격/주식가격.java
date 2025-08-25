class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;  
        int [] answer = new int[n];  
        int i,j;  
        for(i=0;i<n;i++){  
            for(j=i+1;j<n;j++){  
                answer[i]++;  
                if(prices[i] > prices[j]){  
                    break;  
                }  
            }  
        }  
        return answer;  
    }
}