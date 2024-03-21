// 프로그래머스 LV3 DP 문제 정수 삼각형
package Programmers;

public class M1 {
    public static void main(String[] args) {
        int [][] arr = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution(arr));
    }
    public static int solution(int[][] triangle) {
        int n = triangle.length - 1;
        for (int i = n; i > 0; i--) {
            int m = triangle[i].length;
            for (int j = 1; j < m; j++) {
                triangle[i][j - 1] = Math.max(triangle[i][j], triangle[i][j - 1]);
                triangle[i - 1][j - 1] += triangle[i][j - 1];
            }
        }
        return triangle[0][0];
    }

}
