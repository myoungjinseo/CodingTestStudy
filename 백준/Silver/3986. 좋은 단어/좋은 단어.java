import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if(stack.isEmpty())
                cnt++;
        }
        System.out.println(cnt);
    }
}
