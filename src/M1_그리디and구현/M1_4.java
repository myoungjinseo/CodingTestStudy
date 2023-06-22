package M1_그리디and구현;

// 공포도 문제
// 공포도가 그룹 인원보다 적으면 되는 문제

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M1_4 {
    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // int 형 입력받기
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());     // 배열형 입력받기
        }
        Collections.sort(arrayList);    // 내림차순 정렬

        // ex) n = 5, arrayList 2 3 1 2 2
        // 내림차순 후 1 2 2 2 3
        int result = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count +=1;
            if(count >= arrayList.get(i)){  //카운트보다 내림차 순이 크거나 같을 때
                result +=1; // 결과 값 + 1
                count =0;   // 카운트 초기화를 해준다.
            }
        }
        System.out.println(result);
    }
}
