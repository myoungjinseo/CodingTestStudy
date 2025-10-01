import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] answer = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(answer, (a, b) -> (b + a).compareTo(a + b));

        if (answer[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]);
        }

        return sb.toString();
    }
}