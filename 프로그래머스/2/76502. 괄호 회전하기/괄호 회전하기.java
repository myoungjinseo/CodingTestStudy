import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        int answer = 0;
        int n = s.length();
        s += s;
        A:for(int i = 0; i < n; i++){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(int j = i; j < i + n; j++){
                char a = s.charAt(j);
                if(!map.containsKey(a)){
                   stack.push(a);
                }else{
                    if(stack.isEmpty() || !stack.pop().equals(map.get(a)))
                        continue A;
                }
            }
            if(stack.isEmpty())
                answer++;
        }
        return answer;
    }
}