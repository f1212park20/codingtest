function solution(num_list) {
    var answer = [];
    
    var count=0;
    var count1=0;
    for(var i=0;i<num_list.length;i++){
        if(num_list[i] % 2==0){
            count++;
        }
        else if(num_list % 2!=0){
            count1++;
        }
    }
    
    answer[0]=count;
    answer[1]=count1;
    
    return answer;
}