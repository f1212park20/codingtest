class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        		
		String str="";
		String str1="";
		String str2="";
		String str3="";
		str=String.valueOf(a);
		str1=String.valueOf(b);
				
		str2=str+str1;
		str3=str1+str;
		
		int number=Integer.parseInt(str2);
		int number1=Integer.parseInt(str3);
		
		if(number > number1) {
			answer = number;
		}
		else {
			answer = number1;
		}
        return answer;
    }
}