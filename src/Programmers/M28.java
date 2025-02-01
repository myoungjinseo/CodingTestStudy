package Programmers;



public class M28 {
    boolean solution(String s) {
        long answer = 0;

        String [] strArr = s.split("");
        for(String i : strArr){
            if (i.equals("p") || i.equals("P"))
                answer--;

            if (i.equals("y") || i.equals("Y"))
                answer++;
        }
        return answer == 0;
    }

    public static void main(String[] args) {
        M28 m27 = new M28();
        System.out.println(m27.solution("pPoooyY"));
    }
}
