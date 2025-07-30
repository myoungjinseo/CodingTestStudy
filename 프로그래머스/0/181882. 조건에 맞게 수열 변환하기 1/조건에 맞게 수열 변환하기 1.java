import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                    .map(i -> i >= 50 ? (i % 2 == 0 ? i / 2 : i) : (i % 2 == 0 ? i : i * 2))
                    .toArray();
    }
}