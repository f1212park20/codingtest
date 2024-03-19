class Solution {
    public int solution(String number) {
        int answer = 0;
        
        
        String[] arr=number.split("");
        
        int cnt=0;
		for(int i=0;i<arr.length;i++) {
			cnt+=(Integer.parseInt(arr[i]));
		}
		answer=cnt%9;
             
        return answer;
    }
}