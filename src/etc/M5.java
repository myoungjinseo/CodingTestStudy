package etc;

import java.util.Scanner;

public class M5 {
    public static int solution(int a){
        int result = 0;
        for (int i = 1; i < a; i++) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[m+1];
        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()] += 1;
        }
        int count = solution(n);

        for (int i = 1; i < m+1; i++) {
            if (arr[i] > 1){
                count -= solution(arr[i]);
            }
        }
        System.out.println(count);
    }
}
