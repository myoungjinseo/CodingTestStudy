// LV 2 최댓값과 최솟값
package Programmers;

public class M2 {

    public static String solution(String s) {
        String answer = s;
        String[] arr = answer.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
            if (min > Integer.parseInt(arr[i])) {
                min = Integer.parseInt(arr[i]);
            }
        }
        answer = "" + min + " " + max + "";

        return answer;
    }


    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
}
