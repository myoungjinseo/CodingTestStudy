package BOJ;

import java.util.Scanner;

public class M_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        int lcm = a/gcd * b/gcd * gcd;

        System.out.println(gcd(a,b));
        System.out.println(lcm);

    }

    public static int gcd(int a, int b) {
        if (b == 0)return a;
        return gcd(b, a%b);
    }
}
