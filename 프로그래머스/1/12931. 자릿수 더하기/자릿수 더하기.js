function solution(n)
{
    var answer = 0;

    var str=String(n).split("");
    
    
    for(var i=0;i<str.length;i++){
        answer+=Number(str[i]);
    }
       
    

    return answer;
}