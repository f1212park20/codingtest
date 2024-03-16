class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] str=binomial.split(" ");
		
		int arr=Integer.parseInt(str[0]);
		int arr1=Integer.parseInt(str[2]);
		
		if(str[1].equals("+")) {
			answer=arr+arr1;
		}
		else if(str[1].equals("-")) {
			answer=arr-arr1;
		}
		else if(str[1].equals("*")) {
			answer=arr*arr1;
		}
        
        
        return answer;
    }
}