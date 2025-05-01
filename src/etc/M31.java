package etc;

import java.util.ArrayDeque;

public class M31 {
    public static void main(String[] args){
        int decimal = 12345;
        System.out.println(solution(decimal));
    }
    public static String solution(int decimal){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while(decimal > 0){
            stack.push(decimal % 2);
            decimal /= 2;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
