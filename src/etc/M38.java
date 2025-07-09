package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class M38 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int maxVal = 0, minVal = 100000;
        String maxName = "", minName = "";

        for(int i = 0; i < input; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());

            if(maxVal < a){
                maxVal = a;
                maxName = s;
            }
            if(minVal > a){
                minVal = a;
                minName = s;
            }
        }
        System.out.println(maxName + " " + maxVal);
        System.out.println(minName + " " + minVal);
    }
}