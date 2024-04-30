package etc;

import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int [] arr = new int[s.length()];
        int cntZ = 0;
        int cntO = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        if (arr[0] == 1){
            cntO +=1;
        } else {
            cntZ +=1;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                if (arr[i+1] == 1){
                    cntO += 1;
                } else {
                    cntZ += 1;
                }
            }
        }

        System.out.println(Math.min(cntO , cntZ));

    }
}
