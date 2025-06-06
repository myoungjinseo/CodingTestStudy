import java.util.*;
class Solution {
    public static int[] solution(int[] a){
        int n = a.length;
        int [] answer = new int[n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                answer[i]++;
                if(a[i] > a[j]){
                    break;
                }
            }
        }
        return answer;
    }
}