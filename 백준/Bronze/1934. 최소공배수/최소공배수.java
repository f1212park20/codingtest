import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
			// 최대공약수(GCD) 계산
			int gcd=getGCD(num1, num2);
			
            //최소 공약수
			int lcm =(num1 * num2)/gcd;
			System.out.println(lcm);
		}
        
    }
    
    public static int getGCD(int num1, int num2) {
		//최대공약수로 반환
		if(num1 % num2==0) {
			return num2;
		}
		
		// num1 % num2의 결과를 새로운 num1로 하고, num2를 새로운 num2
		//최대공약수
		return getGCD(num2, num1 % num2);
	}
}