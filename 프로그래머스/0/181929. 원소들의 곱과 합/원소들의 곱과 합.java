class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int count=0;
		int mul=1;
		for(int i=0;i<num_list.length;i++) {
			mul*=num_list[i];
			count+=num_list[i];
		}
		
		
		if(count*count>mul) {
			answer=1;
		}
		else {
			answer=0;
		}
                
        return answer;
    }
}