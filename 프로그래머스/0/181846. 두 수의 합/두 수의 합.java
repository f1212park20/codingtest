import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
               
        BigInteger num=new BigInteger(a);
		BigInteger num1=new BigInteger(b);
        
        BigInteger sum = num.add(num1);
        
        return sum.toString();
    }
}