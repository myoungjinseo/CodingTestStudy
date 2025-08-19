import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : participant) {
            map.put(str,map.getOrDefault(str,0) + 1);
        }
        for (String str : completion) {
            int n = map.get(str) - 1;
            if(n == 0)
                map.remove(str);
            else
                map.put(str,n);
        }
        return map.keySet().iterator().next();
    }
}