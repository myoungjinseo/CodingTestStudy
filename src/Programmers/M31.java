package Programmers;


public class M31 {
    public boolean solution(int x) {
        int n = 0;
        String [] arr = Integer.toString(x).split("");
        for (String i : arr){
            n += Integer.parseInt(i);
        }
        return x % n == 0;
    }

    public static void main(String[] args) {
        M31 m = new M31();
        System.out.println(m.solution(11));
    }
}
