import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for(int i = 0; i < sizes.length; i++){
            int a = Math.max(sizes[i][0],sizes[i][1]);
            int b = Math.min(sizes[i][0],sizes[i][1]);
            if(w < a)
                w = a;
            if(h < b)
                h = b;
        }
        return w * h;
    }
}