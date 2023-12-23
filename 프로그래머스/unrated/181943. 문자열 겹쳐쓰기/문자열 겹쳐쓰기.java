class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int myStringLen = my_string.length();
        int overwriteStrLen = overwrite_string.length();
        
        answer += my_string.substring(0,s);
        answer += overwrite_string;
        answer += my_string.substring(overwriteStrLen+s, myStringLen);
        return answer;
    }
}