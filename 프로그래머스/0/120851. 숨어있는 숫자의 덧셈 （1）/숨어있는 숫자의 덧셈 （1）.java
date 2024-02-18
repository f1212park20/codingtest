import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] intStr = my_string.replaceAll("[^0-9]", "").split("");
        
        Arrays.sort(intStr);
		
		for(int i=0;i<intStr.length;i++) {
			answer+=Integer.valueOf(intStr[i]);
		}
        
        return answer;
    }
}