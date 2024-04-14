package Programmers;

public class M6 {
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            if (arr[i].length() == 0) {
                answer += " ";
            } else {
                answer += now.substring(0, 1).toUpperCase();
                answer += now.substring(1).toLowerCase();
                answer += " ";
            }
        }
        if (s.substring(s.length() - 1).equals(" ")) {
            return answer;
        }
        return answer.substring(0, answer.length() - 1);
    }


    public static void main(String[] args) {
        String str = "3people unFollowed me";
        System.out.println(solution(str));
    }
}
