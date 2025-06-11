import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        A : while(true){
            String s = br.readLine();
            if(s.equals("."))
                break;
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == '[' || c == '(')
                    stack.push(c);
                if(c == ']' || c == ')'){
                    if(stack.isEmpty() || !stack.pop().equals(map.get(c))){
                        System.out.println("no");
                        continue A;
                    }
                }
            }
            if (stack.isEmpty())
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
