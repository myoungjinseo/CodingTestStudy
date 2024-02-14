// 시간 : 30분
package M4_BinarySearch;

import java.util.Scanner;

public class M4_1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = binarySearch(0, n, arr, target);

        if (result == -1){
            System.out.println("원소가 존재 하지 않습니다");;
        }else {
            System.out.println(result);
        }
    }

    public static int binarySearch(int start, int end, int[] arr, int target) {
        while(start <= end){
            int mid = (start + end) /2;
            if (arr[mid] == target) return mid+1;
            else if (arr[mid] > target) end = mid-1;
            else start = mid +1;
        }
        return -1;
    }
}
