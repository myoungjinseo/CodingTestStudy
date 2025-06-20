class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int n = s.length();
        if(!(n == 4 || n == 6))
            return false;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c >  64)
               return false; 
        }
        return true;
    }
}