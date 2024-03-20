function solution(n) {
    var answer = 0;
    var arr=n.toString();
    
    for(var i=0;i<arr.length;i++){
        answer+=Number(arr[i]);
    }
        
    return answer;
}