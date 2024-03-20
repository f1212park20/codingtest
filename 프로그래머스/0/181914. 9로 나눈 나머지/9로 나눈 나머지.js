function solution(number) {
    var answer = 0;
    
    var cnt=0;
    for(var i=0;i<number.length;i++){
        cnt+=Number(number[i]);
    }
    answer=cnt % 9;
    
    return answer;
}