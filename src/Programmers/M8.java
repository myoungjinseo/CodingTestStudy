package Programmers;

public class M8 {
    public static boolean solution(String s) {
        boolean answer = true;

        int cntP = 0;
        int cntY = 0;
        for(int i = 0; i< s.length(); i++){
            String a = String.valueOf(s.charAt(i));
            if(a.equals("p") || a.equals("P")) cntP++;
            if(a.equals("y") || a.equals("Y")) cntY++;
        }
        return cntP == cntY;
    }
    public static void main(String[] args) {
        solution("pPoooyY");
    }
}
