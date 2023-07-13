package M3_Sort;

// 삽입 정렬 문제 예시

public class M3_2 {

    public static void main(String[] args) {
        int n = 10;
        int [] arr = {7,5,9,0,3,1,6,2,4,8}; // 정렬할 배열
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]){     // 현재 값이 현재까지의 최대 인수 값보다 작을 경우
                    // 교체 알고리즘
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;     // 아니면 멈춤
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
