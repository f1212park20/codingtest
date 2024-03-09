import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {
     
        int end=num_list.length-1;
		int start=num_list.length-2;
			
		List<Integer> arr=new ArrayList<>();
						
		for(int i=0;i<num_list.length;i++) {
			arr.add(num_list[i]);
		}
		
		int count=0;
		if(num_list[end]>num_list[start]) {
			count=num_list[end]-num_list[start];
			arr.add(count);
		}
		else {
			count=num_list[end]*2;
            arr.add(count);
		}
		       
        return arr;
    }
}