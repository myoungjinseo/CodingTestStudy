package etc;

import java.io.*;
import java.util.*;

class M37 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0; i < input; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int b = Integer.parseInt(st.nextToken());

            switch(s){
                case "+" :
                    answer += a + b;
                    break;
                case "-" :
                    answer += a - b;
                    break;
                case "*" :
                    answer += a * b;
                    break;
                case "/" :
                    answer += a / b;
                    break;
            }
        }
        System.out.println(answer);
    }
}