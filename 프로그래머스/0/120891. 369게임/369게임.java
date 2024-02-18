class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String arr=String.valueOf(order);
		
		String[] intStr =arr.split("");
		
		
		for(int i=0;i<intStr.length;i++) {
			if(intStr[i].equals("3") || intStr[i].equals("6") || intStr[i].equals("9")) {
				answer++;
			}
		}
		System.out.println(answer);
        
        
        return answer;
    }
}