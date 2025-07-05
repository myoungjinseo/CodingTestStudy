class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("a|i|o|e|u", "");
        return answer;
    }
}