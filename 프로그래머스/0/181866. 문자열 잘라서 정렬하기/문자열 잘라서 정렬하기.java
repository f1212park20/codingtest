import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
     	
		String[] intStr =myString.split("x");
		List<String> resultList=new ArrayList<>();
		
		for(String str:intStr) {
			if(!str.isEmpty()) {
				resultList.add(str);
			}
		}
		
		
		 String[] resultArr = resultList.toArray(new String[resultList.size()]);
		 Arrays.sort(resultArr);
		 
        
        
        return resultArr;
    }
}