class Solution {
    public int solution(int n, int k) {
        
        int a=n / 10;
		System.out.println(a);
		int answer=n*12000+k*2000-a*2000;
        
        return answer;
    }
}