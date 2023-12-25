class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int num=0;
        int num1=0;
        for(int i=0;i<num_list.length;i++){
                        
            if(i % 2 ==0){
                num+=num_list[i];
            }
            else if(i % 2 !=0){
                num1+=num_list[i];
            }
        }
        
        if(num > num1){
            answer=num;
        }
        else{
            answer=num1;
        }
        
        return answer;
    }
}