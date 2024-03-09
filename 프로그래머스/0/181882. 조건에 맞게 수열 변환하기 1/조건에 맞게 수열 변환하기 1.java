import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        
        List<Integer> answer=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=50) {
				if(arr[i] % 2==0) {
					answer.add(arr[i]/2);
					
				}
				else {
					answer.add(arr[i]);
				}
				
			}
			else if(arr[i]<50) {
				if(arr[i] % 2!=0) {
					answer.add(arr[i]*2);
				}
				else {
					answer.add(arr[i]);
				}
			}
			
		}
        
        
        return answer;
    }
}