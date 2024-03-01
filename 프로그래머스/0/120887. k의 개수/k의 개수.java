class Solution {
    public int solution(int i, int j, int k) {
     
        String n=String.valueOf(k);
        
        int count=0;
	    for(int x=i;x<=j;x++) {
	        String str=String.valueOf(x);
	        String[] intStr =str.split("");
	        
	        for(int y=0;y<intStr.length;y++) {
	        	if(intStr[y].equals(n)) {
	        		count++;
	        	}
	        }
	    }
	   
        
        return count;
    }
}