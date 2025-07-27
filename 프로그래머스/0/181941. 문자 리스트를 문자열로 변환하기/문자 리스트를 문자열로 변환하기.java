import java.util.stream.Collectors;
import java.util.*;

class Solution {
    public static String solution(String[] strlist) {
        return Arrays.stream(strlist).collect(Collectors.joining(""));
    }
}