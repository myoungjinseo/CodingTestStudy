package etc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class M21 {
    public static void main(String[] args) {
        int [] arr = {4,2,2,1,3,4};
        arr = solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] solution(int [] arr){
        Integer [] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
