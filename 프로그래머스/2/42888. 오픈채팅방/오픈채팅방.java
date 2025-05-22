import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("Enter","님이 들어왔습니다.");
        map.put("Leave","님이 나갔습니다.");
        HashMap<String,String> uid = new HashMap<>();
        
        for(String s : record){
            String[] cmd = s.split(" ");
            if(cmd.length == 3)
                uid.put(cmd[1],cmd[2]);
        }
        for(String s : record){
            String[] cmd = s.split(" ");
            if(map.containsKey(cmd[0]))
                answer.add(uid.get(cmd[1]) + map.get(cmd[0]));
        }
        return answer.toArray(new String[0]);
    }
}