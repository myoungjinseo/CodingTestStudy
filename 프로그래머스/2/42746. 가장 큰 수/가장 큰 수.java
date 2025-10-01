import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String[] data = Arrays
            .stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);

    
        Arrays.sort(data, (a, b) -> {
            String combine1 = a + b;
            String combine2 = b + a;
            return combine2.compareTo(combine1); 
        });

    
        StringBuilder sb = new StringBuilder();
        for (String num : data) {
            sb.append(num);
        }

    
        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}