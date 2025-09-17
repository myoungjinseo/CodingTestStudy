import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int a = Math.round((float) (n * 15) / 100);
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int b = Integer.parseInt(br.readLine());
            arr[i] = b;
        }
        Arrays.sort(arr);
        int answer = 0;
        for (int i = a; i < n - a; i++) {
            answer += arr[i];
        }
        answer = Math.round((float) answer / (n - (a * 2)));
        System.out.println(answer);

    }
}
