// 서로소 집합
// 합집합 연산이 편향되게 이루어지는 경우 찾기 함수가 비효율적 동작 최악 O(V)
package M7_Graph;

import java.util.Scanner;

public class M7_1 {
    // 노드의 개수는 최대 100000개라고 가정
    public static int v,e;
    public static int [] parent = new int[100001]; // 부모 테이블 초기화하기

    // 특정 원소가 속한 집합을 찾기
    public static int findParent(int x) {
        // 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        if (x == parent[x]) return x;
        return findParent(parent[x]);
    }

    // 두 원소가 속한 집합을 합치기
    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        // 부모 테이블상에서, 부모를 자기 자신으로 초기화
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        // Union 연산을 각각 수행
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            unionParent(a,b);
        }

        // 각 원소가 속한 집합 출력하기
        System.out.println("각 원소가 속한 집합: ");
        for (int i = 1; i <= v; i++) {
            System.out.print(findParent(i)+ " ");
        }
        System.out.println();

        // 부모 테이블 내용 출력하기
        System.out.println("부모 테이블: ");
        for (int i = 1; i <= v; i++) {
            System.out.print(parent[i]+ " ");
        }
        System.out.println();
    }
}
