class Solution {
    public String[] solution(String my_string) {

		String trimStr = my_string.trim();
	
		String[] answer = trimStr.split("\\s+");
        return answer;
    }
}