import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String arr=String.valueOf(n);
		
		String[] arr1=arr.split("");
        
		for(int i=0;i<arr1.length;i++) {
			answer+=Integer.parseInt(arr1[i]);
		}
        

        return answer;
    }
}