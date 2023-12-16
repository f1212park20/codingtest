class Solution {
    public int solution(int a, int b) {
        int answer = 0;
               
        String str="";
		String str1="";
		String str2="";
		str=String.valueOf(a);
		str1=String.valueOf(b);
				
		str2=str+str1;
		
		int number=Integer.parseInt(str2);
		int n=2*a*b;
		
		if(number > n) {
			answer = number;
		}
		else {
			answer = n;
		}
        return answer;
    }
}