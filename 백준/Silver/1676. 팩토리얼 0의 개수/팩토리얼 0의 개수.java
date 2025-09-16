import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int n1 = n / 5;
        int n2 = n / 25;
        int n3 = n / 125;
        System.out.println(n1 + n2 + n3);

    }
}
