package M3_Sort;

// 선택 정렬 문제 예시

public class M3_1 {
    public static void main(String[] args) {
        int n =10;  //배열의 크기
        int [] arr = {7,5,9,0,3,1,6,2,4,8}; // 정렬할 배열

        for (int i = 0; i < n; i++) {       //배열의 수 만큼
            int min_index = i;
            for (int j = i+1; j < n; j++) {     // 배열 +1 수 비교하기 위해
                if (arr[min_index] > arr[j]){   // 앞의 배열 값이 더 크면
                    min_index = j;      // index j 칸 뒤로 보내기
                }
            }
            int temp = arr[i];      // 큰 값 저장
            arr[i] = arr[min_index];        // 작은 값 앞으로 이동
            arr[min_index] = temp;      // 저장한 큰 값 뒤로 저장
        }

        // 모든 값 불러오기기
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}
