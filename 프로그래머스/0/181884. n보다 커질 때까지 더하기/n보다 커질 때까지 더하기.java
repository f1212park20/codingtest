class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int count=0;
        for(int i=0;i<numbers.length;i++) {
			count+=numbers[i];
			if(count>n) {
				answer=count;
				break;
			}
		}
        
        return answer;
    }
}