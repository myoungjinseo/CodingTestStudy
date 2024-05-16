package etc;

import java.util.Scanner;

public class M14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] result = {a+b, a-b, a*b, a/b};
        for (int i : result){
            System.out.println(i);
        }
    }
}
