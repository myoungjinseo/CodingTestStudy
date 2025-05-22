import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int[] arr = Arrays.stream(strArr)
                             .mapToInt(Integer::parseInt)
                             .toArray(); 
        int min,max; 
        max = min = arr[0];
        for(int i : arr){
            if(max < i)
                max = i;
            if(min > i)
                min = i;
        }
        return min + " " + max;
    }
}