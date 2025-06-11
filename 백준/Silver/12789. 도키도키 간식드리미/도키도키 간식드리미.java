import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int cnt = 1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != cnt){
                if(!stack.isEmpty() && stack.peek() == cnt){
                    stack.pop();
                    i--;
                    cnt++;
                } else{
                    stack.push(arr[i]);
                }
            } else {
                cnt++;
            }
        }
        boolean result = true;
        for(int i = 0; i < stack.size(); i++){
            if(stack.pop() == cnt){
                cnt++;
            } else {
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
