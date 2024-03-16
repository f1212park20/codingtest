class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String arr="";
		String arr1="";
		for(int i=0;i<num_list.length;i++) {
			if(num_list[i] % 2==0) {
				arr+=String.valueOf(num_list[i]);
				
			
			}
			else {
				arr1+=String.valueOf(num_list[i]);
			}
		}
		
		
		int inner=Integer.parseInt(arr);
		int inner1=Integer.parseInt(arr1);
		
		answer=inner+inner1;
        
        
        return answer;
    }
}