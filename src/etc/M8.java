package etc;

import java.util.Scanner;

public class M8 {
    public static int companyA(int p,int w) {
        return p * w;
    }
    public static int companyB(int q, int s,int r, int w) {
        if (w < r){
            return q;
        }
        w -= r;
        return q + s * w;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p,q,s,r,w;
        for (int i = 1; i <= n; i++) {
            p = sc.nextInt();
            q = sc.nextInt();
            r = sc.nextInt();
            s = sc.nextInt();
            w = sc.nextInt();
            System.out.printf("#%d %d%n",i,Math.min(companyA(p,w),companyB(q,s,r,w)));
        }
    }
}
