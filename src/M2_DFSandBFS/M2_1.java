package M2_DFSandBFS;

// 스택 구현 예제

import java.util.Stack;

public class M2_1 {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();


        // 선입후출 -> 함수 실행 후 5,2,3,1 들어가 있음
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop();
        s.push(1);
        s.push(4);      // 넣기
        s.pop();

        while(!s.empty()){
            System.out.print(s.peek() + " ");       // peek() 최상위 수 보여주기
            s.pop();        // 꺼내기
        }
    }
}
