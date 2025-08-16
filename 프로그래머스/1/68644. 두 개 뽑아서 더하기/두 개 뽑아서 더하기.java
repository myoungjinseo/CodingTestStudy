import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if(i == j)
                    continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream()
            .sorted()
            .mapToInt(i -> i)
            .toArray();
    }
    

}