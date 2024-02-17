import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
		
		Arrays.sort(sides);
        
		int max= sides[sides.length-1];
		for(int i=0;i<sides.length;i++) {
			
			if(sides[0]+sides[1]==max || sides[0]+sides[1]<max) {
				answer=2;
			}
			else {
				answer=1;
			}
			
		}
        
        return answer;
    }
}