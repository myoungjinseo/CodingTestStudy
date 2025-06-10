class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long a = Long.parseLong(p);
        int n = p.length();
        for(int i = 0; i < t.length() - n + 1; i++){
            long b = Long.parseLong(t.substring(i, i+n));
            if(a >= b)
                answer++;
        }
        return answer;
    }
}