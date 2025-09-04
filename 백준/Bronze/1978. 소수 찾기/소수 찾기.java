import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int aCnt = 0;
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) aCnt++;
                if (aCnt > 2){
                    break;
                }
            }
            if (aCnt == 2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
