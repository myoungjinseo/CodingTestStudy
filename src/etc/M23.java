package etc;

import java.util.ArrayList;
import java.util.Arrays;

public class M23 {
    public static void main(String[] args){
        int [] answers = {1,2,3,4,5};
        //int[] answers = {1,3,2,4,2};
        int [] result = soultion(answers);
        System.out.println(Arrays.toString(result));
    }
    public static int [] soultion(int[] answers){
        int [][] m = {{1,2,3,4,5}
                ,{2,1,2,3,2,4,2,5}
                ,{3,3,1,1,2,2,4,4,5,5}
        };
        int [] result = new int[3];
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < m.length; j++){
                if(answers[i] == m[j][i% m[j].length])
                    result[j]++;
            }
        }
        int maxScore = Arrays.stream(result).max().getAsInt();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i< result.length; i++){
            if(result[i] == maxScore)
                answer.add(i+1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
