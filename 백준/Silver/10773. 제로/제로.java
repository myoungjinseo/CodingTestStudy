import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(br.readLine());
            if(a != 0)
                stack.push(a);
            else
                stack.pop();
            
                
        }
        for(int i : stack){
            answer += i;
        }

        System.out.println(answer);
    }
}