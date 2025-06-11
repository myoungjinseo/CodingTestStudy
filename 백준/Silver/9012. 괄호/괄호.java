import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        A : for(int i = 0; i < n; i++){
            String s = br.readLine();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == '(')
                    stack.push(c);
                else{
                    if(stack.isEmpty()){
                        System.out.println("NO");
                        continue A;
                    } else
                        stack.pop();
                }
            }
            if(stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}