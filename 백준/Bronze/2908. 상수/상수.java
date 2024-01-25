import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        String str=sc.next();
		String str1=sc.next();
		
		//문자열 뒤집
		StringBuffer sb = new StringBuffer(str);    
		String reverse = sb.reverse().toString();
		
		StringBuffer sb1 = new StringBuffer(str1);    
		String reverse1 = sb1.reverse().toString();
		
		int arr=Integer.parseInt(reverse);
		int arr1=Integer.parseInt(reverse1);
		
		if(arr < arr1) {
			System.out.println(arr1);
		}
		else {
			System.out.println(arr);
		}       
		
	
	}
}