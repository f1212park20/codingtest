import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        String[] intStr = my_string.replaceAll("[^0-9]", "").split("");
		
		Arrays.sort(intStr);
		
		int [] answer=new int[intStr.length];
		
		for(int i=0;i<answer.length;i++) {
			answer[i]=Integer.parseInt(intStr[i]);
		}
        
        return answer;
    }
}