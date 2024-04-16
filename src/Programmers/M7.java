// 프로그래머스 LV 2 - 이진 변환 반복하기
package Programmers;

public class M7 {
    public static int[] solution(String s) {
        int oneCnt = 0;
        int strCnt1 = 0;
        int strCnt2 = 0;
        int c = 0;
        while (!s.equals("1")) {
            strCnt1 = s.length();
            s = s.replace("0", "");
            oneCnt = s.length();
            strCnt2 += strCnt1 - s.length();
            s = Integer.toBinaryString(oneCnt);
            c++;
        }
        return new int[]{ c, strCnt2};
    }

    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(solution(s));
    }
}
