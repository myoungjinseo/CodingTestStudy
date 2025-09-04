import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String str = "";
        boolean isV = false;
        StringBuilder sb = new StringBuilder();
        A : while (!(str = sc.nextLine()).equals("end")) {
            int vCnt = 0;
            int cCnt = 0;
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                isV = checkV(str.charAt(i));
                if(isV)
                    cnt++;
                if (isV) {
                    vCnt++;
                    cCnt = 0;
                } else {
                    cCnt++;
                    vCnt = 0;
                }
                if(i != 0 && str.charAt(i) == str.charAt(i-1) && str.charAt(i) != 'e' && str.charAt(i) != 'o') {
                    sb.append("<" + str + "> is not acceptable.").append("\n");
                    continue A;
                }

                if(vCnt == 3 || cCnt == 3) {
                    sb.append("<" + str + "> is not acceptable.").append("\n");
                    continue A;
                }
            }
            if(cnt == 0) {
                sb.append("<" + str + "> is not acceptable.").append("\n");
            } else {
                sb.append("<" + str + "> is acceptable.").append("\n");
            }
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    public static boolean checkV(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
