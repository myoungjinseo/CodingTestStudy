package etc;

import java.util.ArrayDeque;

public class M30 {
    public static void main(String[] args){
        String s = ")()(";
        System.out.println(solution(s));
    }
    public static boolean solution(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] a = s.toCharArray();
        for(char c : a){
            if(c == '(' )
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
