import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int answer;
    static int[] score;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        score = new int[n + 2];
        for (int i = 1; i < n + 1; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        answer = 0;
        dp = new Integer[n + 2];

        dp[0] = 0;
        dp[1] = score[1];
        dp[2] = score[1] + score[2];

        System.out.println(topDown(n));


    }
    public static int topDown(int num) {
        if(dp[num] == null) {
            dp[num] = Math.max(topDown(num - 3) + score[num - 1], topDown(num - 2)) + score[num];
        }
        return dp[num];
    }
}