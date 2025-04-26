package etc;
import java.util.*;
public class M24 {
    public static void main(String[] args){
        int n = 5;
        int [] stages = {2,1,2,6,2,4,3,3};
        int [] result = solution(n, stages);
        System.out.println(Arrays.toString(result));
    }
    private static int[] solution(int n, int[] stages){
        int [] result = new int [n + 2];
        for (int i : stages){
            result[i]++;
        }
        HashMap<Integer, Double> fails = new HashMap<>();
        double r = stages.length;
        for(int i = 1; i < n+1; i++){
            if(result[i] == 0){
                fails.put(i,0.);
            } else {
                fails.put(i,result[i] / r);
                r -= result[i];
            }
        }
        return fails.entrySet().stream().sorted((o1, o2) ->
                o1.getValue().equals(o2.getValue()) ? Integer.compare(o1.getKey(),
                o2.getKey()) : Double.compare(o2.getValue(),
                o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}
