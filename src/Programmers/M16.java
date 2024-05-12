package Programmers;
import java.util.Scanner;

public class M16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int a = 0;
        System.out.print(1);
        for(
                int test_case = 2;
                test_case <=T;test_case++)

        {
            if (test_case % 10 == 3 || test_case % 10 == 6 || test_case % 10 == 9) {
                a += 1;
            }
            if (test_case / 10 % 10 == 3 || test_case / 10 % 10 == 6 || test_case / 10 % 10 == 9) {
                a += 1;
            }
            if (test_case / 100 % 10 == 3 || test_case / 100 % 10 == 6 || test_case / 100 % 10 == 9) {
                a += 1;
            }
            if (a == 0) {
                System.out.printf(" " + test_case);
            } else {
                switch (a) {
                    case 1:
                        System.out.printf(" -");
                        break;
                    case 2:
                        System.out.printf(" --");
                        break;
                    case 3:
                        System.out.printf(" ---");
                        break;
                }
                a = 0;
            }


        }
    }
}
