class Solution {
    public int solution(int num, int k) {
     
        String x=String.valueOf(k);
		String str=String.valueOf(num);
		
		int answer=str.indexOf(x)+1;
        
        if(answer==0){
            answer=-1;
        }
        
        return answer;
    }
}