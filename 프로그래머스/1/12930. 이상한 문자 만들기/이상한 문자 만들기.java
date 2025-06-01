class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String s1 = "";
        int cnt = 0;
            
        for(int i = 0; i < s.length(); i++){
            s1 = s.substring(i,i+1);
            if(s1.equals(" ")){
                sb.append(s1);
                cnt = 0;
            } else{
                if(cnt % 2 == 0){
                    sb.append(s1.toUpperCase());
                    cnt++;
                } else{
                    sb.append(s1.toLowerCase());
                    cnt++;
                }
            }
        }
        return sb.toString();
    }
}