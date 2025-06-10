class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, 1).toUpperCase());
        for(int i = 1; i<s.length(); i++){
            String c = s.substring(i, i+1);
            if(s.charAt(i-1) == ' ')
                sb.append(c.toUpperCase());
            else
                sb.append(c.toLowerCase());
        }
        return sb.toString();
    }
}