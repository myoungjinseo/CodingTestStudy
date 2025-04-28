package etc;

import java.util.HashMap;

public class M26 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();  // 해시맵 초기화
        // 해시맵 데이터 삽입
        map.put("apple",1);
        map.put("banana",2);
        map.put("orange",3);
        // 해시맵 값 출력
        System.out.println(map);   // {banana=2, orange=3, apple=1}

        String key = "apple";
        // 해시맵의 데이터 검색
        if(map.containsKey(key)){
            int value = map.get(key);
            System.out.println(key + ": " +  value);  // apple: 1
        }
        else {
            System.out.println(key + "는 해시맵에 없습니다.");
        }

        // 해시맵 수정
        map.put("banana",4);
        System.out.println(map);     // {banana=4, orange=3, apple=1}

        // 해시맵 삭제
        map.remove("orange");
        System.out.println(map);    // {banana=4,apple}

    }
}
