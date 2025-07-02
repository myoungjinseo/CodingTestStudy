import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        Arrays.sort(numbers);
        return numbers[n-2] * numbers[n-1];
    }
}