import java.util.Scanner;
 
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
				
		int n=sc.nextInt();
		
		int[] answer=new int[n];
		
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			answer[i]=a;
		}
		
		int count=0;
		int b=sc.nextInt();
		for(int i=0;i<answer.length;i++) {
			if(answer[i]==b) {
				count++;
			}
		}
		System.out.println(count);		
	}
}