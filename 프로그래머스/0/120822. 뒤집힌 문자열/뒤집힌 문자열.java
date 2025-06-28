class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int n = my_string.length();
        for(int i = n-1; i > -1; i--){
            char c = my_string.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
}