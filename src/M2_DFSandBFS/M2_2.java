package M2_DFSandBFS;

// 큐 문제 예시


import java.util.LinkedList;
import java.util.Queue;

public class M2_2 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // 선입선출 -> 함수 실행 후 3,7,1,4 들어가 있음
        q.offer(5); //삽입
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();   //삭제
        q.offer(1);
        q.offer(4);
        q.poll();


        while(!q.isEmpty()){
            System.out.print(q.poll() +  " ");
        }
    }
}
