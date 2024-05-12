package Programmers;

import java.util.Scanner;

public class M14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int [] arr = {11,7,5,3,2};

        for (int i = 1; i <= testCase; i++) {
            int t = sc.nextInt();
            int [] cnt = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                if (t % arr[j] == 0){
                    t /= arr[j];
                    cnt[j] += 1;
                    j -=1;
                }
            }
            System.out.printf("#%d %d %d %d %d %d%n",i,cnt[4],cnt[3],cnt[2],cnt[1],cnt[0]);

        }


    }
}
