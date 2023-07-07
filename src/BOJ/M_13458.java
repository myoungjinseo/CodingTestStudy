package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class M_13458 {
    public static int result(int a, int b,int c){
        int result = 0;
        a -=b;
        result +=1;
        if(a >0){
            if(a%c == 0){
                result += a/c;
            } else {
                result +=a/c+1;
            }

        }
        return result;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> location = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            location.add(sc.nextInt());
        }

        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        long count = 0;


        for (int i = 0; i < a; i++) {
            count += result(location.get(i),b,c);

        }
        System.out.println(count);


    }
}

