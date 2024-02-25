class Solution {
    public int solution(String s) {
        
        int answer=0;
		String[] intStr =s.split(" ");
		
		for(int i=0;i<intStr.length;i++) {
			if(intStr[i].equals("Z")) {
				
				answer-=Integer.parseInt(intStr[i-1]);
			}else{
				
				answer+=Integer.parseInt(intStr[i]);
			}
			
		}
        
        return answer;
    }
}