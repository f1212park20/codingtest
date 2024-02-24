class Solution {
    public int solution(int[] array) {
        int count=0;
		for(int i=0;i<array.length;i++) {
			String arr=String.valueOf(array[i]);
			String[] intStr =arr.split("");
			
			for(int j=0;j<intStr.length;j++) {
				if(intStr[j].equals("7")) {
					count+=1;
				}
			}
		}
        
        
        return count;
    }
}