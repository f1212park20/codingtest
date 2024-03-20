function solution(binomial) {
    var answer;
    
    const[a, op, b]  = binomial.split(' ');
    let Num1=Number(a);
    let Num2=Number(b);
    
    if(op=='+'){
        answer=Num1+Num2;
    }else if(op=='-'){
        answer=Num1-Num2;
    }else if(op=='*'){
        answer=Num1*Num2;
    }
    
    
    
    
    return answer;
}