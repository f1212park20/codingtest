class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        String[] arr=control.split("");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains("w")){
				n+=1;
                answer=n;
			}
			else if(arr[i].contains("s")) {
				n-=1;
                answer=n;
			}
			else if(arr[i].contains("d")) {
				n+=10;
                answer=n;
			}
			else if(arr[i].contains("a")) {
				n-=10;
                answer=n;
			}
			
		}
        
        return answer;
    }
}