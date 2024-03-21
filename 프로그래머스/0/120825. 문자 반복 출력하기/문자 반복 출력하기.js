function solution(my_string, n) {
    var answer = "";
    
    var str=my_string.split("");
    
    for(var i=0;i<str.length;i++){
        answer+=str[i].repeat(n);
    }
    
    return answer;
}