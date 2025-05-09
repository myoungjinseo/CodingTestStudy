class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        return n % 2 == 1 ? s.substring(n / 2, n/2 +1) : s.substring(n / 2 -1, n/2+1);
    }
}