import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String[] strArr) {
        List<String> arr=new ArrayList<>();
        
        for(int i=0;i<strArr.length;i++) {
			if(i % 2!=0) {
				arr.add(strArr[i].toUpperCase());
			}
			else if(i % 2==0) {
				arr.add(strArr[i].toLowerCase());
			}
		}
		
        return arr;
    }
}