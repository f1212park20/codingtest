class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String arr=String.valueOf(x);
		
		String[] arr1=arr.split("");
		
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			sum+=Integer.parseInt(arr1[i]);
		}
		
		if(x % sum==0) {
			answer=true;
		}
		else{
			answer=false;
		}
        
        return answer;
    }
}