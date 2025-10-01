class Solution {
    public static int[] solution(String s) {
        int transforms = 0;
        int removedZeros = 0;

        while(!s.equals("1")){
            String convertedString = s.replaceAll("0","");
            removedZeros += s.length() - convertedString.length();
            transforms++;
            s = Integer.toBinaryString(convertedString.length());
        }
        return new int[]{transforms,removedZeros};
    }
}