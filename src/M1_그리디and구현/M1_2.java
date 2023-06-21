package M1_그리디and구현;


public class M1_2 {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int cnt = 0;
        while(n !=1){
            int target = (n/k) * k;
            cnt += (n - target);
            n = target;
            if (n <k) break;
            cnt +=1;
            n /= k;

        }
        cnt += (n-1);
        System.out.println(cnt);
    }
}
