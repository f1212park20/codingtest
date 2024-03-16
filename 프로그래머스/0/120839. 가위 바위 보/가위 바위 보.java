class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] str=rsp.split("");
		
		for(int i=0;i<str.length;i++) {
			if(str[i].contains("0")) {
				answer+=String.valueOf(5);
			}
			if(str[i].contains("2")) {
				answer+=String.valueOf(0);
			}
			if(str[i].contains("5")) {
				answer+=String.valueOf(2);
			}

			
		}
        
        return answer;
    }
}