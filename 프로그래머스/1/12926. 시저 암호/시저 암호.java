class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        int n1 = s.length();
        int[] intArr = new int[n1];
        char[] charArr = new char[n1];
        
        for(int i = 0; i < n1; i++){
            int c = s.charAt(i);
            intArr[i] = c;
            c += n;
            if((intArr[i] < 91 && c > 90) ||  c > 122){
                c -= 26;
            }
            charArr[i] = (char) c;
            if(charArr[i] < 64 || charArr[i] > 122)
                charArr[i] = ' ';
            answer.append(charArr[i]);
        }
        return answer.toString();
    }
}